
public class UnaryOperatorDemo {

	public static void main(String[] args) {
		
		int a = 10;
		
		int b = a++;
		
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		
		int c = 15;
		int d = ++c;
		
		System.out.println("c is " + c);
		System.out.println("d is " + d);
		
		a++;
		System.out.println(a);
		
	}
}
