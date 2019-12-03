package interfaceProgram;

public class Test {

	public static void main(String[] args) {
		Shape s=new Rectangle();
		System.out.println(s.x);
		// s.x=25; variables are of final so cannot be re-initialized
		s.draw();
		s.getArea();
		s.applyColor();
		Shape.displayColor();

	}

}
