package prodapt.javaProgram;

public class Sample {
	void run() {
		int var=20;
		System.out.println(var);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Shape sh=new Shape();	
			sh.edges=12;
			sh.color="red";
			System.out.println(sh.edges + sh.color);
			
	}

}
class Demo{
	public static void main(String[] args) {
		Sample s=new Sample();
		s.run();
	}
}