  package string;

public class StringProgram {

	public static void main(String[] args) {
		//STRING //IMMUTABLE
		String str1="hello";
		String str2="hello";
		
		int no=str1.compareTo(str2);
		//str2=str1;
		System.out.println(no);
		System.out.println(str1 == str2); //check object reference are pointing to same object
		System.out.println(str1.equals(str2)); //checks for content
		
		//STRING_BUFFER  //MUTABLE
		StringBuilder sbd=new StringBuilder();
		StringBuffer sb1= new StringBuffer().append("Hello");
		sb1.insert(1,"Java");
		StringBuffer sb2= new StringBuffer("Hello");
		System.out.println(sb1 == sb2);  //reference comparison
		//sb.append("world");
		System.out.println(sb1.equals(sb2)); //reference comparison // there is no equals method in stringbuffer class so Object class equal method will be called
		StringProgram st=new StringProgram();
		System.out.println(st); //print fully qualified object id (with hash code)
		System.out.println(st.toString()); //print fully qualified object id (with hash code)
	
	String str=sb1.toString();   //converting STRINGBUFFER object to STRING
	//In string class there is no method to reverse the string. But in string buffer reverse method is there.
	String rev="FEVER";
	StringBuffer rev1=new StringBuffer(rev).reverse();
	rev=rev1.toString();
	System.out.println(rev);
	
	
	}	

}
