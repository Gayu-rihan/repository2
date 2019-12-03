package encapsulation;

public class SubClass {
	public static void main(String[] args) {
		Encaps pri=new Encaps();
		pri.setId(25);
		pri.setName("Gayathri");
		System.out.println(pri.getId());
		System.out.println(pri.getName());
		
		System.out.println(pri.toString());
		
}
}
