package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entities.College;
import entities.Student;
import exceptions.CollegeException;
import exceptions.StudentException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CollegeDaoImpl implements CollegeDao {

	private EntityManagerFactory emf;
	private EntityManager em;

	public CollegeDaoImpl() {
		emf = Persistence.createEntityManagerFactory("CollegeStudentUnit");
		em = emf.createEntityManager();
	}

	@Override
	public College registerCollege(College college) throws CollegeException {
		try {
			college.setCollegeName("C_V_Raman");
			college.setCollegeAddress("Khondagiri");
			em.getTransaction().begin();
			em.persist(college);
			em.getTransaction().commit();
			return college;
		} catch (Exception e) {
			throw new CollegeException("College is Null", e);
		}
	}
//		EMUtil.provideEntityManager().getTransaction().begin();
//		EMUtil.provideEntityManager().persist(college);
//		EMUtil.provideEntityManager().getTransaction().commit()

	@Override
	public College getCollegeFromCollegeId(int collegeId) throws CollegeException {
//		collegeId = 1;
		try {
			System.out.println("College: " + collegeId);
			System.out.println(em.find(College.class, collegeId));
			return em.find(College.class, collegeId);
		} catch (Exception e) {
			throw new CollegeException("Colege ID Not found while retrieving college.", e);
		}
	}

	@Override
	public List<College> getAllCollege() throws CollegeException {
		try {
			Session session = null;
			Query query = (Query) em.createQuery("SELECT c FROM College c");
			List<College> results = query.getResultList();
			System.out.println(results);
			return results;
		} catch (Exception e) {
			throw new CollegeException("College data not available", e);
		}

	}

	@Override
	public Student registerStudentToCollege(int studentId, int collegeId) throws CollegeException, StudentException {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public List<Student> getAllStudentsFromCollegeId(int collegeId) throws CollegeException, StudentException {
		// TODO Auto-generated method stub
		try{
			Session session = null;
			Query query = (Query) em
					.createQuery("select * from College c inner join student s on s.studentRoll= c.CollegeId");
			List results = query.getResultList();
			System.out.println(results);
			return results;

		}catch (Exception e) {
			// TODO: handle exception
			throw new CollegeException("Student data not found", e);
		}
		
	}

}
