package string;

public class StringMethods {

	public static void main(String[] args) {
		int [] x[];
		int[] []y;
		int[] a,b;
		int[] c[],d[];
		int[] []e,f[];
//		int[] []a1,[]b1;
//		int[] []a2,[]b2,[]c2;
//		System.out.println(x.);
		//int[][] f =new int[][4];    
		String str1="Hello is world";
		String str2="hello";
		//char[] ch= {'h','e','l','l','o'};
		System.out.println(str1);
		System.out.println(str1.substring(5,7));
		System.out.println("Hash code of str1:" +str1.hashCode());
		System.out.println("Length of str1:" + str1.length());
		System.out.println("isEmpty str1:" +str1.isEmpty());
		System.out.println("charAt str1:" +str1.charAt(0));
		System.out.println("code point at :" +str1.codePointAt(1));
		System.out.println("code point before:" +str1.codePointBefore(1)); 
		System.out.println("code point count:" +str1.codePointCount(0, 4));
		
		System.out.println("Length of str1:" +str1.offsetByCodePoints(0, 4));
		//System.out.println(str1.getChars(ch, 5));
		System.out.println("str1 equals str2:" +str1.equals(str2));
		System.out.println("str1 content equals of str2:" +str1.contentEquals(str2));
	}

}
