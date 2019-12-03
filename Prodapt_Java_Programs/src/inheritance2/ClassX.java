package inheritance2;

import inheritance1.ClassA;

public class ClassX extends ClassA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA A=new ClassA();
		ClassA.m1(); //m1() is in classA inheritance1 package so classA is extended.
		ClassY.m2(); //m2() is in classY inheritance2(same) package
	}

}
