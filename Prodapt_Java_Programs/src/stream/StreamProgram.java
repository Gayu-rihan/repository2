package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgram {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(5);
		marks.add(1);
		marks.add(15);
		marks.add(20);
		//marks.add(9);
		int len=marks.size();
		System.out.println("Elements :"+marks);
		//filter  //only in functional programming filter method is applicable
		List<Integer> l1=marks.stream().filter(ele->ele%2==0).collect(Collectors.toList());
		System.out.println("Filter Even numbers :"+l1);
		
		//map-apply function on each element in collection
		List<Integer> l2=marks.stream().map(ele->ele+5).collect(Collectors.toList());
		System.out.println("add all elements by 5 :"+l2);
		
		//count will return a long value so it should 
		long l3=marks.stream().filter(ele->ele%2==0).count();
		System.out.println("Even count :"+l3);
		
		//sorted list
		List<Integer> l4=marks.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted :"+l4);
		System.out.println("Mininum value	:"+l4.get(0));
		System.out.println("Maximum value	:"+l4.get(len-1));
		//sorting- descending order
		List<Integer> l5=marks.stream().sorted((i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println("Descending Sort :"+l5);
		System.out.println("Maximum value	:"+l5.get(0));
		System.out.println("Mininum value	:"+l5.get(len-1));
		//minimum value
		Integer min=marks.stream().min((i1,i2)->(i1>i2)?1:(i1<i2)?-1:0).get();
		System.out.println("Min :"+min);
		
		//maximum value
		Integer max=marks.stream().max((i1,i2)->(i1>i2)?1:(i1<i2)?-1:0).get();
		System.out.println("Max :"+max);
		//forEach function to print elements
		marks.parallelStream().forEach(System.out::println);	}

}
