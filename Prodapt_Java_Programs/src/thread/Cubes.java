package thread;

public class Cubes extends Thread{

	
	public static void cubes() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("Cube of "+i+" is: "+Math.pow(i, 3));
			Thread.sleep(10);
		}
	}
	
	public void run() {
			try {
				cubes();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	

}
