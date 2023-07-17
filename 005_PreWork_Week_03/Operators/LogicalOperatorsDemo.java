
public class LogicalOperatorsDemo {
	
	public static void main(String[] args) {
	
		boolean isStudentAlreadyPlacedinJob = true;

		int marks = 50;
		String department = "CSE";
		float projectRating = 8.0f;

		if(marks > 80 && department == "CSE") {
			System.out.println("Eligible to participate in campus recruitment 1");
		}
		
		if(marks >= 90 || projectRating >= 8.0 ) {
			System.out.println("Eligible to participate in campus recruitment 2");
		}

		if(!isStudentAlreadyPlacedinJob) {
			System.out.println("Eligible to participate in campus recruitment 3");
		}
	}
}
