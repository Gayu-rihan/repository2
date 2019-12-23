package lambda;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> ref= (num) -> num%2 !=0;
		System.out.println(ref.test(13));
		
		BiPredicate<String,String> ref1=(val1,val2) -> val1.equals(val2);
		System.out.println(ref1.test("Hello", "hello"));
		
	}

}
