package lambda;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<Double> ref= () -> Math.random();
		System.out.println(ref);
		System.out.println(	ref.get());
		System.out.println(Math.random());
	}

}
