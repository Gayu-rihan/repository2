package fileHandling;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileChar {
	public static void main(String[] args) throws IOException  {
		FileReader fi=new FileReader("C:\\Users\\Trainee\\Desktop\\File.txt");	
		FileWriter fo=new FileWriter("C:\\Users\\Trainee\\Desktop\\XYZ.txt");
		int val;
		//to check end of the file
		while((val=fi.read())!= -1 ) {
			System.out.println(val); //character value of letters
			fo.write(val);
		}
		//close the file
		fi.close();
		fo.close();
	
	}
}
