package prodapt.javaProgram;

public class Examples {
public static void main(String[] args) {
	/*int a=127;
	byte b=(byte)a;
	System.out.println(b);
	*/
	String str1="hello";
	String str2="java";
	char a=str1.charAt(0);
	char b=str1.charAt(0);
	int count=str1.length()+str2.length();
	System.out.println(count);
	if(a<b) {
		System.out.println("No");
	}
	else
		System.out.println("Yes");
	String cap = str1.substring(0,1).toUpperCase() + str1.substring(1);
	String cap1 = str2.substring(0,1).toUpperCase() + str2.substring(1);
	System.out.println(cap+" "+cap1);
}
}
