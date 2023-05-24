package exceptions;

public class StudentException extends Exception {
	
	public void student() {
		throw new RuntimeException("Student not found");
	}
	
	public void studentNotAvaliable() {
		throw new RuntimeException("Student data is not avaliable");
	}
}
