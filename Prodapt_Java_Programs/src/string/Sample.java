package string;

import java.util.Random;

public class Sample {

	public static void main(String[] args) {
		Random random = new Random();
		String id="XYZ_"+Math.abs((random.nextInt()));
		System.out.println(id);
		
		int num=00123;
		
		String id1="XYZ_"+num;
		num++;

	}

}
