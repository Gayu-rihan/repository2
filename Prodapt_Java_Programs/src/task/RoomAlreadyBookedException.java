package task;

public class RoomAlreadyBookedException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public RoomAlreadyBookedException(String s) {
	super(s);
	}

}
