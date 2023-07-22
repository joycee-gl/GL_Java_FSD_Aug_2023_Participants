
public class ForLoopContainingContinueStatementDemo {

	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i ++) {
			
			System.out.println("About to process I with value ->" + i);
			if (i == 5) {
				
				System.out.println("Invalid input");
				continue;
			}
			System.out.println("I's value->" + i + " processed");
		}
	}
}
