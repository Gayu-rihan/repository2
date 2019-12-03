package exception;

public class ExceptionProgram {
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println("Program starts");
		try {
			calc.div(35,0);
			int[] i=new int[] {1,2,3,4};
			System.out.println(i[3]);
			String str="Hello World";
			System.out.println(str.charAt(4));
		}
		catch(ArithmeticException e) {
			System.out.println("'y' value should be greater than or equal to 'x' value");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index exceeds");
		}
		catch(NullPointerException e) {
			System.out.println("String is empty");
		}
		catch(Exception e) {
			System.out.println("Inside Exception block");
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside finally block");
		}
		
		System.out.println("Program Ends");
		
	}
}
