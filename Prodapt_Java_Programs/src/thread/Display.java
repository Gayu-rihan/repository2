package thread;

public class Display {
	synchronized void greet(String s) throws InterruptedException {
	
		for(int i = 0; i<10;i++) {
			//System.out.println("Greeting....");
			System.out.println("Hello  "+ s);
			
			//Thread.sleep(10);
		}
		
	}
	

}
