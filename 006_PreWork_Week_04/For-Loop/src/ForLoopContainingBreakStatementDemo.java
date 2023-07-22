
public class ForLoopContainingBreakStatementDemo {

	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i ++) {
			
			if (i == 5) {
				break;
			}
			System.out.println("I's value->" + i);
		}
	}
}
