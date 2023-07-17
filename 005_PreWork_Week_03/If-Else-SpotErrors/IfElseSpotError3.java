
public class IfElseSpotError3 {
	
	public static void main(String[] args) {
		
		boolean testCondition = false;	
		
		int xValue = -2;
		
		if(testCondition) {
			xValue = xValue + 2;
		} 
		
		if (xValue == 0) {
			System.out.println("xValue will be zero always");
		}
		else {
			System.out.println("xValue will be having value as 2");
		}
		System.out.println("xValue got incremented because of testCondition");		

	}
	
}
