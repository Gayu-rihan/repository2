package thread;

public class ThreadProgram extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<10;i++) {
		 System.out.println("Implementing run method...");
		 try {
			 Thread.sleep(5);
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
	 }
	}

	public static void main(String[] args) throws InterruptedException {
		 ThreadProgram tp1= new ThreadProgram();
		 ThreadProgram tp2= new ThreadProgram();
		 Cubes sp= new Cubes(); //new
		 Square sq= new Square(); //new
		 tp1.start();
		 tp2.start();
		 System.out.println(Thread.activeCount());
		 tp1.join();
		 tp2.join();
		 //tp1.run();
		// tp1.start();
		 //tp1.destroy();
		 
		 sp.start(); //Runnable
		 sq.start();//Runnable
		 sp.stop();
		 System.out.println(Thread.activeCount());
		 for(int i = 0; i<5;i++) {
			 System.out.println("Main method...");
			 Thread.sleep(5);
			 
		 }
		 System.out.println(Thread.activeCount());
		 sp.stop();
		 System.out.println(sp.getClass().getName());
		 System.out.println(sq.getClass().getName());
		 
	}

}
