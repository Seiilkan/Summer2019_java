package Day_10_IFstatement;

public class if_else_statement {

	public static void main(String[] args) {
		
		// if & else 
	//	if (condition) { gets execute only if condition is true
	         // A
		//}
	// else { else block only gets if the condition is false
		//}
		
		if (9>8) {
		}
			System.out.println("9 is greater than 8");
		
		if ( 9<= 8) { 
			System.out.println("9 is greater or equal to 8");
		} // it does not executed -- FALSE
		
		else {
			System.out.println("9 is less than 8");
		}  // but ELSE does it
		
		
		if(false==!false) {
			System.out.println("if block"); //false!!!
		}
		
		else {
			System.out.println("else block"); //executes
		}
		
		//task: if score , 60 ==> failed
		// if score >= 60 but less than 90 --- passed
		// if score >= 90 -- passed with distinction
		
		
		int score = 59;
		if (score >=60) {
			System.out.println("passed");}

		else {
			System.out.println("failed");
		}
		if (score >= 90) {
		System.out.println("you made A+, excellent");
		}
		
		else {
			System.out.println("You could not make A+");
		}
		
		
		
		//triangle
		
		// 1. three variables -- three angles
		
		// 2. write a program to check if the triangle is valid or not
		
		int angle1 = 20, angle2 = 50, angle3 = 75;
		boolean valid =(angle1+angle2+angle3) ==180; //false 145!=180
		if (valid) {
			System.out.println("it's a valid triangle");
		}
		else {
			System.out.println("invalid triangle, do some math");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	
}
