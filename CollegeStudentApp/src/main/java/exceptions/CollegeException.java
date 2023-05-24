package exceptions;


public class CollegeException extends Exception {

	public void colleage() {
		throw new RuntimeException("College data must not be null");
	}

	public void collegeData() {
		throw new RuntimeException("Colleges are not exists in the DB");
	}

}
