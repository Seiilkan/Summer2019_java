package Day_10_IFstatement;

public class Nested_IF {
 public static void main(String[] args) {
	/* when one condition contains another
	 */
	 if(true) {
	 
		 if(true) {
	 }	 
	 }
	 System.out.println("Hello World");
	 
	 if(true) { 
		 if(false) {
			 System.out.println("Hello World");
	 }	 
	 }
	 
	 if(true) { 
		 System.out.println("Hello Batch12"); //printed
		 if(false) {
			 System.out.println("Hello World");
	 }	 else {
		 System.out.println("Sally");  //printed
		 
	 }
	 }
	 
	 /*
     60<= garde < 70 ==> D
     70 <= grade < 80 ==> C
     80 <= grade < 90 ==> B
     90 <= grade <= 100 ==>A
    50 <= grade < 60 ==> F
    40<= grade <50 ==> G
    30 <= grade < 40 ==> H
    20<=  grade < 30 ==> I
    10 <= grade < 20 ==> J
    0<=  grade <10  ==> K
    
    
    */
   int grade = 100;
   
   if( grade >= 60 && grade <= 100) {
       System.out.println("you passed");
       
       if( grade >=90 && grade <= 100) {
           System.out.println("\twith a grade of A");
           
       } 
       else if(grade >=80 && grade < 90) {
           System.out.println("\twith a grade of B");
       }
       else if(grade >= 70 && grade < 80) {
           System.out.println("\twith a grade of C");
       }
       else if (grade >= 60 && grade < 70) {  
           System.out.println("\t with a grade of D");
       }
      
    }
   
       
      int grade1 = 40;
      
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
          System.out.println("\t with a grade of I");
      }
      else if (grade1 > 1 && grade1 < 10) {  
          System.out.println("\t with a grade of J");
      }
      else if (grade1 <= 0){ 
   	   System.out.println("\t with a grade K");
      }   
	   
      }  
	   
	   
	   
	   /* if(grade < 60) {
           System.out.println("You failed with a grade of F");
       }
       else { // greater than 100
           System.out.println("Invalid score, error 404");
       }
       
   } */
	 
	 
	 
	 
}
}
