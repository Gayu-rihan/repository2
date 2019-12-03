package lambda;

public class Cubes implements Runnable {
	public static void cubes() {
		for(int i=0;i<10;i++) {
			System.out.println("Cube of "+i+" is: "+Math.pow(i, 3));
			
		}
	}

	@Override
	public void run() {		
		try {
			cubes();
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
