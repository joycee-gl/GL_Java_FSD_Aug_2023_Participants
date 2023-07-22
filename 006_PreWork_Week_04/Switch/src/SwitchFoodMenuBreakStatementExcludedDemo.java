import java.util.Scanner;

public class SwitchFoodMenuBreakStatementExcludedDemo {

	public static void main(String[] args) {
		
		
		System.out.println("1. Burger");
		System.out.println("2. Juice");
		System.out.println("3. Cake");

		System.out.println("Select an option (1/2/3): ");

		Scanner input = new Scanner(System.in);
		
		int option = input.nextInt();
		
		switch (option) {
			
			case 1: {

				System.out.println("Burgers");
				System.out.println("------------");

				System.out.println("Lola Burger");
				System.out.println("King Burger");
				System.out.println("Deep Fried Burger");
			}
				
			case 2: {

				System.out.println("Juices");
				System.out.println("------------");
				
				System.out.println("Apple Juice");
				System.out.println("Orange Juice");
				System.out.println("Grape Juice");
			}
			
			case 3: {

				System.out.println("Cakes");
				System.out.println("------------");
				
				System.out.println("Black Forrest");
				System.out.println("Eggless Cake");
				System.out.println("Mango Cake");
				
			}
			
			default : {
				
				System.out.println("Wrong option selected. Type 1 (or) 2 (or) 3");
			}
			
		}
		
	}
}
