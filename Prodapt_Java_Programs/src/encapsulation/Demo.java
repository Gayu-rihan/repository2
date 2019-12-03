package encapsulation;
class PrivateVariable{
	private int rollNo;
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int no) {
		rollNo = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name1) {
		name = name1;
	}

	
}
public class Demo {

	public static void main(String[] args) {
		PrivateVariable pv=new PrivateVariable();
		System.out.println(pv.getRollNo());
		System.out.println(pv.getName());
		pv.setRollNo(10);
		pv.setName("John");
		System.out.println(pv.getRollNo());
		System.out.println(pv.getName());     

	}

}
