package methodExamples;

public class Members {
	int data;
	String name;
	static int value;
	static String userName;
	void instanceMethod(int data, String name) {
		System.out.println("Instance method");
		System.out.println("data: " + data+ "\nName :  "+ name );
	}
	static void staticMethod(int value,String userName) {
		System.out.println("Static method");
		System.out.println("Value: "+value +"\nUserName : " + userName );
	}

	public static void main(String[] args) {
		Members mem=new Members();
		mem.instanceMethod(25,"ABC");  //Instance method so object reference is used to access the method
		staticMethod(20,"XYZ"); //Static method can be directly invoked or className can be used to access the method
		

	}

}
