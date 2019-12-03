package lambda;

public class Squares implements Runnable {
	public static void 	Squares()  {
		for(int i=0;i<10;i++) {
			System.out.println("Squares of "+i+" is: "+Math.pow(i, 2));
			
			
		}
	}

	@Override
	public void run() {		
		try {
			Squares();
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

