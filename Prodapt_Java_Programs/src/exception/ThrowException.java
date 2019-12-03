package exception;

public class ThrowException {

	public static void main(String[] args)  throws OwnException{
		int x=10,y=0;
		if(y==0) {
			throw new OwnException("Y value should not be Zero");  //object creation of OwnException 
		}
		System.out.println(x/y);

	}

}
