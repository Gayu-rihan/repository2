package lambda;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> ref=(name) -> System.out.println("Hello "+name);
		ref.accept("Ram");
	}

}
