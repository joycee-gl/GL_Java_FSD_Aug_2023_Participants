
public class FactorialDemoInAMethod {

	public static void main(String[] args) {
	
		factorial();
	}	
	
	static void factorial() {
		
		int number = 7;

		int previousValueResult = 1;
		int factorialResult = 1;

		for (int index = number; index >= 1; index --) {
						
			int currentValue = index;
			factorialResult = currentValue * previousValueResult;
			previousValueResult = factorialResult;
		}
		
		System.out.println("Factorial of the number (" + number 
				+ ") is " + factorialResult);
		
	}
}
