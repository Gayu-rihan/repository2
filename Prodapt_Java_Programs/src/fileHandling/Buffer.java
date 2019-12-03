package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer {

	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("C:\\Users\\Trainee\\Desktop\\File.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("C:\\Users\\Trainee\\Desktop\\XYZ.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		String val;
		//to check end of the file
		while((val=br.readLine())!= null ) {
			System.out.println(val); //character value of letters
			bw.write(val);
			bw.newLine();
			bw.newLine();
		}
		//close the file
		br.close();
		bw.close();
		fr.close();
		fw.close();
	
	}
}
