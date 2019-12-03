package lambda;

public class LambdaProgram {

	public static void main(String[] args) {
		MaxIntf mi=(num1,num2)->(num1>num2?num1:num2);
		System.out.println(mi.maxFinder(10,7));
		//Implementation class is not required to implement lambda expression 
		Evenf even=(num1)->((num1%2==0)? "Even Number": "Odd Number");
		System.out.println(even.evenNumber(8));

		StringInterface length=(str)->str.length();
		System.out.println(length.stringLength("Welcome"));
	}

	

}
