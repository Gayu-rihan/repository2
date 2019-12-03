package fileHandling;
import java.io.Serializable;

public class Serialize implements Serializable {
	
		private static final long serialVersionUID= 1L;
		int rollNo;
		transient String name;
		
		Serialize (int rollNo,String name){
			this.rollNo=rollNo;
			this.name=name;
		
	}
}
