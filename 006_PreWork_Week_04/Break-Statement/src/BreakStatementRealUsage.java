import java.util.Scanner;

public class BreakStatementRealUsage {

	public static void main(String[] args) {
		
		int noOfInsuranceClaims = 50;
		int noOfFakeClaims = 0;		
		int fakeClaimsThreshold = 5;
		
		for (int i = 1; i <= noOfInsuranceClaims; i ++) {
			
			System.out.println("Processing Insurance Claim with ID ->" + i);
			
			System.out.println("System is verifying the claim...");
			
			System.out.println("Is it a fake claim (Y/N) ?");
			
			Scanner scanner = new Scanner(System.in);
			String aFakeClaim = scanner.nextLine();
			
			if (aFakeClaim.equals("Y")) {
				noOfFakeClaims = noOfFakeClaims + 1;
			}
			
			if (noOfFakeClaims > fakeClaimsThreshold) {
				
				System.out.println("Too many number of fake claims");
				System.out.println("No point in processing this batch of claims..");
				break;
			}
		}
	}
}
