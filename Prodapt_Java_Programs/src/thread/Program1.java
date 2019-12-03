package thread;

public class Program1 extends Thread{
	
	public void run() {
		for(int i=0;i<7;i++) {
		Thread.yield();
		System.out.println("running...");
		try {
			Thread.sleep(100);;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Program1 p1= new Program1();
		
		//p1.wait(400);
		//p1.run();
		//for(int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getName());	
		System.out.println(Thread.currentThread().isAlive());	
		//System.out.println("value of i is: "+i);
		//Thread.sleep(100);
		//}
		p1.run();
		System.out.println("Priority:	"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println("Priority:	"+Thread.currentThread().getPriority());
		System.out.println("MAX Priority:	"+Thread.currentThread().MAX_PRIORITY);
		System.out.println("NORM Priority:	"+Thread.currentThread().NORM_PRIORITY);
		System.out.println("MIN Priority:	"+Thread.currentThread().MIN_PRIORITY);
	}
	

}
