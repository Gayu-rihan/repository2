package prodapt.javaProgram;

public class EnhancedFor {
public static void main(String[] args) {
	int[][] arr=new int[2][2];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++)
		arr[i][j]=i;
	}
	System.out.println("2d array");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++)
		System.out.println(arr[i][j]);
	}
	/*
	
	for(int u:arr)
	{
		System.out.println(u);
	}
	String[] str= {"dio","mock","go"};
	for(String s:str) {
		System.out.println(s);
	}
	*/
	System.out.println("enhanced 2d array");
	for(int[] u:arr) {
		for(int k:u) {
			System.out.println(k);
		}
		
	}
}
}
