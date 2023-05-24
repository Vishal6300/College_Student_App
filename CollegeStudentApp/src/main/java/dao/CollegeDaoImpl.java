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
		college.setCollegeName("C_V_Raman");
		college.setCollegeAddress("Khondagiri");
		em.getTransaction().begin();
		em.persist(college);
		em.getTransaction().commit();
//		EMUtil.provideEntityManager().getTransaction().begin();
//		EMUtil.provideEntityManager().persist(college);
//		EMUtil.provideEntityManager().getTransaction().commit();

		return college;
	}

	@Override
	public College getCollegeFromCollegeId(int collegeId) throws CollegeException {
		// TODO Auto-generated method stub
		collegeId = 1;
		System.out.println("College: " + collegeId);
		System.out.println(em.find(College.class, collegeId));
		return em.find(College.class, collegeId);
	}

	@Override
	public List<College> getAllCollege() throws CollegeException {
		// TODO Auto-generated method stub
		College clg= new College();
		Session session = null ;
		Query query = (Query) em.createQuery("SELECT c FROM College c");
		List results = query.getResultList(); 
		System.out.println(results);
		return null;
	}

	@Override
	public Student registerStudentToCollege(int studentId, int collegeId) throws CollegeException, StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudentsFromCollegeId(int collegeId) throws CollegeException, StudentException {
		// TODO Auto-generated method stub
		return null;
	}

}
