package Day_11_Review;

public class WarmUp {

	public static void main(String[] args) {
		
	int year = 2019;
    boolean Leapyear = year%4 == 0;
    if (Leapyear) {
    	System.out.println("Year is leap year");
    } else {
    	System.out.println( year+ " is not a leap year");
    }
	
    int grade = 59;
    
    if( grade >= 60 && grade <= 100) {
        System.out.println("you passed");
        
        if( grade >=90 && grade <= 100) {
            System.out.println("\twith a grade of A");
            
        } 
        else if(grade >=80 && grade < 89) {
            System.out.println("\twith a grade of B");
        }
        else if(grade >= 70 && grade < 79) {
            System.out.println("\twith a grade of C");
        }
        else if (grade >= 60 && grade < 69) {  
            System.out.println("\t with a grade of D");
        }
        else {
        	System.out.println("\t failed with a grade of D");
        }
     }
	
    int grade1 = 105;
    boolean A = grade1 >= 90 && grade1 <= 100;
    boolean B = grade1 >= 80 && grade1 <= 89;
    boolean C = grade1 >= 70 && grade1 <= 79;
    boolean D = grade1 >= 60 && grade1 <= 69;
    boolean ValidGrade = grade1 >=0 &&  grade1 <= 100;

if(ValidGrade) {
    // in order to multi-brach if gets executed, first ValidGrade has to be true
    // if condition can be evaluate to multiple scenarios
    if(A) {   //  100 >= grade >= 90
        System.out.println("You made A");
    }
    else if(B) {  //  90> grade >= 80
        System.out.println("You made B");
    }
    else if(C) { //  80> grade >= 70
        System.out.println("You made C");
    }
    else if(D) {  //  70> grade >= 60
        System.out.println("You made D");
    }
    else {  // 0 =< grade < 60  
        System.out.println("You made F");
    }
    
} 
else {   // grade < 0  || grade >100
    
    System.out.println("Invalid Grade");
} 
	
/*declare an int variable called Age
declare a boolean variable "GoodPerson"

if goodperson is false:
        age >= 18 => cigra
        age >= 21 => Hookah
        age >= 25 => alcohol
        
        age < 18  => milk
        
else 
// bad for your health */


int age =21;
boolean GoodPerson = false;
    
if( age >= 18) {

    if(GoodPerson) {
        System.out.println("Alcohol is bad for your health");
    }
    else { // GoodPerson=false, && age >=18
        
        System.out.println("You can buy Cigrates");
        if(age>=21) {
            System.out.println("You can buy Hookah");
        }
        if(age >= 25) {
            System.out.println("You can buy Alcohol");
        }
        
    }
    
    
} else {
    System.out.println("buy milk");
}
    
 int month = 0;
 
 if (month > 0 && month < 13) {
   if (month == 1) {
	  System.out.println("31 days");
   }
   else if(month ==2) {
	   System.out.println("28 days");
   }
   else if(month ==3) {
	   System.out.println("31 days");
   }
   else if(month ==4) {
	   System.out.println("30 days");
   }
   else if(month ==5) {
	   System.out.println("31 days");
   }
   else if(month ==6) {
	   System.out.println("30 days");
   }
   else if(month ==7) {
	   System.out.println("31 days");
   }
   
   else if(month%2 == 0) {
	   System.out.println("31 days");
   } else {
		   System.out.println("30 days");
	   }
   

   
   
 } else {
	 System.out.println("Invalid Entry");
 }
 
    
// Grouping by 28, 30 and 31 days and invalid input

 int month2 = 2;
 int Year = 2019;
 if(month2>0 && month2 <13) {  //  1~12
     
         if(month2 ==2 ) { // month2=2
             if(Year%4 == 0) {
                 System.out.println("29 days");
             } 
             else {
                 System.out.println("28 days");
             }
         }
         
         else if( month2== 4 || month2==6 ) { // month2=4 or month2=6
             
             System.out.println("30 days");
             
         } else if ( month2==9 || month2==11) { // month2=9 or month2=11
             System.out.println("30 days");
             
         } else { //  month2 : 1,3,5,7,8,10,12
             System.out.println("31 days");
         }
 
 } else {
     
     System.out.println("Invalid Entry");
     
 }
	
	
	
	
 
 
 
 
 
 
 
 
 
		
		
		
	}
}
