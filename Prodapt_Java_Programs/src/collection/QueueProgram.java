package collection;

import java.util.concurrent.LinkedBlockingQueue;

public class QueueProgram {

	public static void main(String[] args) {
		LinkedBlockingQueue<Integer> lbq=new LinkedBlockingQueue<>(5);
		lbq.add(4);
		lbq.add(76);
		lbq.add(3);
		lbq.add(14);
		lbq.add(65);
		//lbq.add(13);
		System.out.println(lbq);
	}

}
