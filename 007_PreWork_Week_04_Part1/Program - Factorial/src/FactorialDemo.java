
public class FactorialDemo {
	
	public static void main(String[] args) {
	
		int number = 7;
		
		int previousResult = 1;
		int iterationResult = 1;
		
		for (int index = number; index >= 1; index --) {
			
			int currentValue = index;
			//System.out.println("currentValue : " + currentValue);
			
			iterationResult = currentValue * previousResult;
						
			previousResult = iterationResult;
		}
		
		System.out.println("Factorial of the number " + number + " is " + iterationResult);
		
	}
}
