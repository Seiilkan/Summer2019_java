package Day_10_IFstatement;

public class Assignments {
	
	public static void main(String[] args) {
		/*50 <= grade < 60 ==> F
		         40<= grade <50 ==> G
		         30 <= grade < 40 ==> H
		         20<=  grade < 30 ==> I
		         10 <= grade < 20 ==> J
		         0<=  grade <10  ==> K */
		
		//Task 1 
		  int grade1 = 0;
	      
	      if (grade1 >= 0 && grade1 < 60) {  
	          System.out.println("Failed");
	      
	      if (grade1 >= 50 && grade1 < 60) {  
	          System.out.println("\t with a grade of F");
	      }   
	      else if (grade1 >= 40 && grade1 < 50) {  
	          System.out.println("\t with a grade of G");
	      }   
	      else if (grade1 >= 30 && grade1 < 40) {  
	              System.out.println("\t with a grade of H");
	      }
	      else if (grade1 >= 20 && grade1 < 30) {  
	          System.out.println("\t with a grade of I");
	      }
	      else if (grade1 >= 10 && grade1 < 20) {  
	          System.out.println("\t with a grade of J");
	      }
	      else if (grade1 <= 0 && grade1 < 10) {  
	          System.out.println("\t with a grade of K");
	      }
	   
	      }  	
		
	     // task 2
	      
	      int num1 = 20,num3 = 30;  
	    
	      if(num1 < num3) {
	    	  System.out.println("Bigger number is"+num1);
	    	 }
	      else if (num3 < num1) {
	    	  System.out.println("Bigger number is "+" "+num3);
	      }
	      
	      //task 3
	      
	        int hour = 12; 
			int minute = 45;
			int second = 30;
			
			String amORpm = "am"; 
		
			System.out.println(hour +":" + minute + ":" + second + " "+ amORpm);
	      
		//task 4  
			
		    int statusCode1 = 200;
			String FinalResult = "OK";
			
			System.out.println("status code "+ statusCode1 +" is " +FinalResult);
			  
			
		//task 5
			int number1= 1;
		    int number2 = -6;
		    int number3 = 0;		
		    if(number1 > 0  ) {
		         System.out.println("Positive");
		    
		    if (number2 < 0) {
		        System.out.println("Negative");
		    }
		    if (number3 == 0 ) {
		        System.out.println("Zero");
		    }
				
		    }
		
			
			
			
			
	}
}
