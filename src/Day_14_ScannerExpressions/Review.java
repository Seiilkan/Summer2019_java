package Day_14_ScannerExpressions;

public class Review {

	public static void main(String[] args) {
		
		int num = 5;
		String result = "";
		if (num >=0 && num <= 9) {
		if(num == 9) 
				result = "nine";
			else if (num == 8) 
	         result = "eight";
			
			 else if (num == 7) 
				result = "seven";
			 else if (num == 6) 
				result = "six";
			 else if (num == 5) 
				result = "five";
			 else if (num == 4)
				result = "four";
		     else if (num == 3) 
				result = "three";
		     else if (num == 2) 
				result = "two";
		     else if (num == 1) 
				result = "one";
		     else if (num == 0) 
				result = "zero";
		    
		
	} else 
			result = "Invalid";
		
		
	System.out.println(result);
		
		
		
		int n = 7;
			
			String result2 = (n ==9)? "nine" : (n ==8)? "eight"
					: (n ==7) ? "seven" : (n == 6) ? "six"
					: (n == 5) ? "five"	: (n == 4) ? "four"
					: (n == 4) ? "three": (n == 2) ? "two"		
					: (n == 1) ? "one"	: (n == 0) ? "zero" : "Invalid";
			         
			System.out.println(result2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
	

