package task;

public class InvalidNameException extends Exception{
	public InvalidNameException(){
		System.err.println("invalid name enter again");
	}
}
