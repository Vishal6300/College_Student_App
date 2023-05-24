package utilities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {
	
	public static EntityManagerFactory emf;
	public static EntityManager provideEntityManager() {
		if(emf==null) {
			emf= Persistence.createEntityManagerFactory("CollegeStudentUnit");
		}
		return emf.createEntityManager();
	}

}
