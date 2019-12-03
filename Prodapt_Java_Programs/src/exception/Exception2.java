package exception;

public class Exception2 {
	static int result;
	public static void main(String[] args) {
		try {
			
		m1(10,2);
		}catch(ArithmeticException e) {
			e.printStackTrace()  ;
		}
	}
	public static void m1(int num1,int num2) throws ArithmeticException {
	
		System.out.println(m2(num1,num2));
	
	}
	public static int m2(int num1,int num2) throws ArithmeticException{
		//try {
		result=num1/num2;
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//		}
		return result;
	}
}
