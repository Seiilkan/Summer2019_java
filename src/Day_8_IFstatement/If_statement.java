package Day_8_IFstatement;

public class If_statement {

	// Single statement:
	// if(boolean expression){ 
	//              some codes to run
	//}
		
	// If block onlygets executed if condition is  true
	
	
	
	 // it executes if only expression is true

public static void main(String[] args) {
	
	double TN = 100;
	boolean Cybertek = true;
	boolean Bestschool = true;
	if (Cybertek == Bestschool) { 
		TN += 500;
	}
	
	System.out.println(TN); // 600
	
	//if (Cubertek != Bestschool) {
		//TN -=50;
	//}
	
	//System.out.println(TN);  // false, so it is not execute
	
	
	byte PersonAge = 78; 
	byte VoteAge = 18;
	
	if ( PersonAge >= VoteAge) {
		System.out.println("yes you are eligible to vote");
		System.out.println("Have fun to build a wall");
	}
	
	if (PersonAge > VoteAge) {
		System.out.println("you are unavailable to vote");
	}
	
	/*if (PersonAge == VoteAge) {
		System.out.println("you are unavailable to vote");
	}  it is not true
	*/
	
	
}









}
