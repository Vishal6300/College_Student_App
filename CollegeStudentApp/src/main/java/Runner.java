import dao.CollegeDao;
import dao.CollegeDaoImpl;
import entities.College;
import exceptions.CollegeException;
import exceptions.StudentException;

public class Runner {

	public static void main(String[] args) {
		College clg = new College();

		CollegeDao cd = new CollegeDaoImpl();

		try {
			cd.registerCollege(clg);
		} catch (CollegeException e) {
			// TODO Auto-generated catch block
			System.out.println("Nhi hua");
			e.printStackTrace();
		}

		try {
			cd.getAllCollege();
		} catch (CollegeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			cd.getCollegeFromCollegeId(1);
		} catch (CollegeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
