package lambda;

@FunctionalInterface //to implement lambda expression
interface MaxIntf {
	public int maxFinder(int num1,int num2);
	//public int maxFinder1(int num1,int num2); //Functional interface must have only one abstract method
}


@FunctionalInterface  //to implement lambda expression
interface Evenf{
	public String evenNumber(int num1);
	
}

@FunctionalInterface  //to implement lambda expression
interface StringInterface{
	public int stringLength(String str);
	
}