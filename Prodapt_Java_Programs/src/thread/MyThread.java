package thread;

public class MyThread extends Thread{
	Display d;
	String s;
	MyThread(Display d, String s){
		this.d=d;
		this.s=s;
	}
	
	
	public void run() {
		try {
			d.greet(s);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
