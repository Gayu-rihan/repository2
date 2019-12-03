package lambda;

public class MaxImpl implements MaxIntf{

	@Override
	public int maxFinder(int num1, int num2) {
		return num1>num2?num1:num2;
		
	}

	
}
