package interfaceProgram;

public class Access {

	public static void main(String[] args) {
		CohesionNo c=new CohesionNo();
		System.out.println(c.getNo(24));
		CohesionName cn=new CohesionName();
		System.out.println(cn.getName("John"));

	}

}
