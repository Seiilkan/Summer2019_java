package Day_10_IFstatement;

public class Multi_Branch_IFstatement {

	/* Multi-branch condition
	 if (condition1) { 
	 }     A  -- if this condition is true
	 else if (condition2) {
	 }     B -- if A condition is is false and B is true
	 else (if &if else are not false)
	       C -- if A & B has to be false, C is true
	 */ 

	public static void main(String[] args) {
		
		
		//task
		
		int hour = 23; // Good night
		
		if (hour >=0 && hour <= 12) {
			System.out.println("Good morning");
		}
		else if (hour >12 && hour <= 15) {
			System.out.println("Good afternoon");
		}
		else if (hour > 15 && hour <=23) {
			System.out.println("Good night");
		}
		else {
		System.out.println("noon");
		}
		
int hour1 = 12; // Good morning
		
		if (hour1 >=0 && hour1 <= 12) {
			System.out.println("Good morning");
		}
		else if (hour1 >12 && hour1 <= 15) {
			System.out.println("Good afternoon");
		}
		else if (hour1 > 15 && hour1 <=23) {
			System.out.println("Good night");
		}
		else {
		System.out.println("noon");
		}
		
int hour2 = 18; // good night
		
		if (hour2 >=0 && hour2 <= 12) {
			System.out.println("Good morning");
		}
		else if (hour2 >12 && hour2 <= 15) {
			System.out.println("Good afternoon");
		}
		else if (hour2 > 15 && hour2 <=23) {
			System.out.println("Good night");
		}
		else {
		System.out.println("noon");
		}
		
		//task int num1, num2, num3  -- find bigger number
		
		int num1 = 200, num2 = 300, num3 = 50;
		
		if (num1> num2 && num1 > num3) {
			System.out.println(num1 +"is the bigger number");
		}
		else if (num2> num1 && num2> num3) {
			System.out.println(num2 +" is the bigger number");
		}
		else if (num3> num1 && num3> num3) {
			System.out.println(num3 +"is the bigger number");
		}
		else if (num3 == num2 && num3 > num1) {
		System.out.println(num3+ " and "+num2 +" are the bigger numbers");
		}
		
		else if (num3 == num1 && num3 > num2) {
			System.out.println(num3+ " and "+num1 +" are the bigger numbers");
			}
		else if (num2 == num1 && num2 > num3) {
			System.out.println(num2+ " and "+num1 +" are the bigger numbers");
			}
		else {
			System.out.println("all of them are equal");
		}
		
		
		
		
		
		
		
	}









}



