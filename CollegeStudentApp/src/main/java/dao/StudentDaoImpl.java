package dao;

import java.util.List;

import entities.College;
import entities.Student;
import exceptions.CollegeException;
import exceptions.StudentException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentDaoImpl implements StudentDao {

	private EntityManagerFactory emf;
	private EntityManager em;

	public StudentDaoImpl() {
		emf = Persistence.createEntityManagerFactory("CollegeStudentUnit");
		em = emf.createEntityManager();
	}
	@Override
	public Student registerStudent(Student student) throws StudentException {
		// TODO Auto-generated method stub
		try {
		student.setStudentRoll(1);
		student.setStudentName("Modi");
		student.setMobileNumber("9087890");
		student.setEmail("Modi@gmail.com");
		student.setStatus(true);
		
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		
		return student;
		}catch (Exception e) {
			// TODO: handle exception
			throw new StudentException("Student registration failed", e);
		}
	}

	@Override
	public Student getStudentFromStudentId(int studentId) throws StudentException {
		// TODO Auto-generated method stub
		try {
			System.out.println("Student Id is : "+ studentId);
			System.out.println(em.find(Student.class, studentId));
			return em.find(Student.class, studentId);	
		}catch (Exception e) {
			// TODO: handle exception
			throw new StudentException("Not able to fetch data of student", e);
		}
		
	}

	@Override
	public List<Student> getAllActiveStudents() throws StudentException {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public College getCollegeFromStudentId(int studentId) throws CollegeException, StudentException {
		// TODO Auto-generated method stub
		try {
			System.out.println("Student: " + studentId);
			System.out.println(em.find(College.class, studentId));
			return em.find(College.class, studentId);
		} catch (Exception e) {
			throw new CollegeException("College Not found while retrieving StudentID.", e);
		}
	}

}
