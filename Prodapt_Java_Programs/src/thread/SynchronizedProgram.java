package thread;

public class SynchronizedProgram {
	 
	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d,"Sam");
		MyThread t2 = new MyThread(d,"Kumar");
		MyThread t3 = new MyThread(d,"Ram");
		MyThread t4 = new MyThread(d,"Alex");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
	}
}
