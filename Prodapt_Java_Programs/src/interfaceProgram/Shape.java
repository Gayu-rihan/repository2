package interfaceProgram;

public interface Shape {
	int x=10;
	String color="red";
	void draw();
	void getArea();
	
	//from 1.8 default is introduced
	default void applyColor() {
		System.out.println("color applied");
	}
	//static method
	static void displayColor() {
		System.out.printf("Applied color is %s",color);
	}
}
