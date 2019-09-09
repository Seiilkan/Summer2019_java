package Day_16_Recap;
import java.util.Scanner;
public class WarmUp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your furst name and last name");
		
		String firstname = scan.nextLine(),
		       lastname = scan.nextLine();
		       
		  String fullname = firstname +" "+lastname;
		  fullname= fullname.toUpperCase();
		  System.out.println("your full name is  "+fullname);
		  
		  string fullname = firstname.concat(""+lastname).toLowerCase();
		  
				  
		
		
		
		
		
		
		
	}
	
	
	
}
