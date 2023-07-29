import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Multiplication Table Generator");
		System.out.println("-------------------------------");
		
		System.out.println("Enter the value for 'Multiplication Table Number'");
		int multiplicationTableNumber = scanner.nextInt();//7
		
		System.out.println("Enter the value for 'No of times'");
		int noOfTimes = scanner.nextInt();//10
		
		for (int counter = 1; counter <= noOfTimes; counter ++) {
			
			int multiplicationValue = multiplicationTableNumber * counter;
			
			System.out.printf("%d (*) %d = %d", 
					multiplicationTableNumber, counter, multiplicationValue);
			
			System.out.println();
			
			// 7 (*) 1 = 7
			// 7 (*) 2 = 14
		}
		
	}
}
