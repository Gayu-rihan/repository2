package lambda;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		//MethodReferenceDemo mr = new MethodReferenceDemo();
		ISquare ref = MethodReferenceDemo::square;  //1
		System.out.println(ref.square1(10)); //2
	}
	public static int square(int num) {  //1
		return 	num*num;
	}
	
}

//if interface has static or default method then it won't considered as a functiona
interface ISquare{
	public default int sum(int num) {
		return 0;
	}
	public int square1(int num) ;   //2
		
}

