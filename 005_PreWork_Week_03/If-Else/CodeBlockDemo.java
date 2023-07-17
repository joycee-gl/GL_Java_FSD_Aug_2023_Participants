
public class CodeBlockDemo {

	public static void main(String[] args) {
		
		int i = 10;
		
		if (i == 10) {
			System.out.println("Condition has passed");
			System.out.println("I's value is ->" + i);			
		}
		
		
		{
			int j = 20;
			System.out.println("J's value ->" + j);
		}
		
	}
}
