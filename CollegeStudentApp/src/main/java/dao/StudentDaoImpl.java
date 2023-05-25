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
		
		return null;
	}

	@Override
	public Student getStudentFromStudentId(int studentId) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllActiveStudents() throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public College getCollegeFromStudentId(int studentId) throws CollegeException, StudentException {
		// TODO Auto-generated method stub
		return null;
	}

}
