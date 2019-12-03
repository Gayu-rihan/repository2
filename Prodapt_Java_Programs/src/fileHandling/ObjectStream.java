package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serialize obj1=new Serialize(10,"Gayathri");
		Serialize obj2=new Serialize(11,"Pooja");
		Serialize obj3=new Serialize(12,"Priya");
//		FileInputStream fout=new FileInputStream("C:\\Users\\Trainee\\Desktop\\File.txt");
//		ObjectInputStream objin=new ObjectInputStream(fout);
		ObjectOutputStream objout=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Trainee\\Desktop\\File123.txt"));
		objout.writeObject(obj1);
		objout.flush();
		objout.close();
		
		
		ObjectInputStream objin=new ObjectInputStream(new FileInputStream("C:\\Users\\Trainee\\Desktop\\File.txt"));
		Serialize t=(Serialize)objin.readObject();
		System.out.println(obj1.rollNo+" "+obj1.name);
		System.out.println(obj2.rollNo+" "+obj2.name);
		System.out.println(obj3.rollNo+" "+obj3.name);
		objin.close();
	}
}
