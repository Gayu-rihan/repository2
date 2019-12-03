package collection;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		Stack st= new Stack();
		st.add(1);
		st.add(5);
		st.add('j');
		st.add("hi");
		st.add('j');
		st.add(9.2132);
		System.out.println(st);
		
		System.out.println("Capacity:	"+st.capacity());
		System.out.println("size:	"+st.size());
		System.out.println("contains 100?:	"+st.contains(100));
		System.out.println("empty:	"+st.empty());
		System.out.println("last index of 'j':	"+st.lastIndexOf('j'));
		System.out.println("remove element 'j':	"+st.removeElement('j'));
		System.out.println("search 'hi':	"+st.search("hi"));
		System.out.println("peek:	"+st.peek()); //1st index value -->top element
		System.out.println("pop:	"+st.pop()); // pop top element
		st.push(100);
		st.setSize(20);
		System.out.println("Capacity:	"+st.capacity());
		System.out.println("size:	"+st.size());
		st.clear();
		System.out.println("After cleared:    "+st);
		
	}

}
