package exceptions;

public class StudentException extends Exception {
	
	public StudentException(String msg,Exception e) {
		super(msg);
	}
}
