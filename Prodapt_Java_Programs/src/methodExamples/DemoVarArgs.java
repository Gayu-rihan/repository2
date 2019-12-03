package methodExamples;

public class DemoVarArgs {
	int sum=0;
	public int sum(int... item) {
		for(int i:item) {
			sum+=i;	
		}
		return sum;
	}

	public static void main(String[] args) {
		DemoVarArgs d=new DemoVarArgs();
		System.out.println("Method calling \nSum: "+ d.sum(10,2,35,4));
		
	}

}
