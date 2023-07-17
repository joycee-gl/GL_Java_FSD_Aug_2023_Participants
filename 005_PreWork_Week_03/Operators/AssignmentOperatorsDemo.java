public class AssignmentOperatorsDemo {
	
	public static void main(String[] args){
		
		int a = 10;
		int b = 20;
		int c = 35;
		
		System.out.println("Initial value of a is " +a);

		//20 + 35
		a = b + c;
		System.out.println("Value of a is " +a);

		//a = a + b
		//55 + 20
		a += b;
		System.out.println("Value of a is " +a);

		//a = a + 2
		//75 + 2
		a += 2;
		System.out.println("Value of a is " +a);
		
		//a = a - 2
		//77 - 2
		a -= 2;
		System.out.println("Value of a is " +a);

		//a = a % 10
		//75 % 10
		a %= 10;
		System.out.println("Value of a is " +a);

	}
}