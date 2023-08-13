
import java.util.Scanner;

public class ScannerReadingDifferentDataTypesDemo {

	public static void main(String[] args) {
		
	//	stringFollowedByIntScenario();
		
	//	integerFollowedByStringScenario();
		integerFollowedByStringScenariov2();
	}
	
	private static void stringFollowedByIntScenario() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = in.nextLine();
		
		System.out.print("What is your age? ");
		int age = in.nextInt();
		System.out.printf("Hello %s, age %d\n", name, age);
		
	}

	private static void integerFollowedByStringScenario() {
		
		Scanner in = new Scanner(System.in);

		System.out.print("What is your age? ");
		int age = in.nextInt();
		
		System.out.print("What is your name? ");
		String name = in.nextLine();
		System.out.printf("Hello %s, age %d\n", name, age);
		
	}

	private static void integerFollowedByStringScenariov2() {

		Scanner in = new Scanner(System.in);

		System.out.print("What is your age? ");
		int age = in.nextInt();
		
		in.nextLine(); // read the newline
		
		System.out.print("What is your name? ");
		String name = in.nextLine();
		System.out.printf("Hello %s, age %d\n", name, age);
		
	}
	
}
