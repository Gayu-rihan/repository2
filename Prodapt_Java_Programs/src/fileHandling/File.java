package fileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {
	public static void main(String[] args) throws IOException  {
		FileInputStream fi=new FileInputStream("C:\\Users\\Trainee\\Desktop\\File.txt");
		BufferedInputStream bi=new BufferedInputStream(fi);
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Trainee\\Desktop\\XYZ.txt");
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		int val;
		//to check end of the file
		while((val=bi.read())!= -1 ) {
			System.out.println(val); //byte value of letters
			bo.write(val);
		}
		//close the file
		
		bi.close();
		bo.close();
	
	}

}
