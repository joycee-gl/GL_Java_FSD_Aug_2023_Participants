
public class FibonacciSeries {
	
	
	public static void main(String[] args) {
		
		int SERIES_COUNT = 15;
		
		int firstNo = 0;
		int secondNo = 1;
		
		System.out.print(firstNo + ", ");
		
		System.out.print(secondNo + ", ");
		
		for (int i = 3; i <= SERIES_COUNT; i++) {
			
			int summedNo = firstNo + secondNo;
			
			if(i == SERIES_COUNT) {
				System.out.print(summedNo);
			} else {
				System.out.print(summedNo + ", ");
			}
			
			
			firstNo = secondNo;
			secondNo = summedNo;
			
		}
		
	}
}
