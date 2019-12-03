package lambda;

public class Calc extends Thread{
	int sum=0;
	public int total() throws InterruptedException{
		
		for(int i=0;i<100;i++) {
			sum+=i;
		}
		return sum;
		
	}
	
	public void run() {
		synchronized(this) {
		try {
			total();
			//after completing the total() process notify the other thread that is waiting to access
			//this.notifyAll();//notify will be called only inside synchronized area and with help of object reference call the notify method
			this.notify(); //notify will be called only inside synchronized area and with help of object reference call the notify method
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
	
}
