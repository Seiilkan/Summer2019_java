package Day_10_IFstatement;

public class singleIFstatement {

	public static void main(String[] args) {
		
		if (9 > 8) {
		
		System.out.println("9 is greater than 8");
		
		}
		
		System.out.println("test completed");
		// expression is right, so the second one is compiled
			
			
			// assignment 1
		
		int num1 = 100;
		int num2 = 300;
		int max = 0; // we need to initialize it
		
	
			if (num2> num1 ) {
			
			max = num2;
			
			
	System.out.println("Maximum number between "+ num1 + " and " +  num2  +" is "+max);
			
			
			}
			
			// assignment 2
			
			int hour = 12;  // if it is 25 what is the bug?
			int minute = 45;
			int second = 30;
			
			String amORpm = "am"; // pm
			
	System.out.println(hour +":" + minute + ":" + second + ""+ amORpm);
			
			
			
			//task 3
			int n1= 100, n2 = 500, n3 = 700;
			int maximum = 0;
			
			//n1 maximum: n1>n2 && n1 >n3 
			
		if (n1>n2 && n1 >n3) { 
			maximum = n1;
		}
		
		if (n2>n1 && n2 >n3) {
		    maximum = n2; 
		}
		
		if (n3>n1 && n3>n2) {
			maximum = n3;
		}
			
System.out.println("Maximum number between "+ n1+ ", " +  n2 + ", " +  n3 + " is "+ n3 );	
	
//we can do it too:
String result = "Maximum number between"+ n1 +" "+ n2 +" is "+ n3;		
		System.out.println(result);
		// solution 2	
		
		
		
	if (n1>n2 && n1 >n3) { 
	
	}
	System.out.println(" Maximum number "+ n1);
	
	if (n2>n1 && n2>n3) {
	    
		System.out.println("Maximum number " + n2);
	}
	
	if (n3>n1 && n3>n2) {
		System.out.println("Maximum number " + n3);
	}
	
		
	// task 4
	
	int statusCode = 200;
	String FinalResult = "OK";
	
	if (statusCode == 200) {
		FinalResult = "created";
	
	} 
	System.out.println("status code "+ statusCode +" is " +FinalResult);	
		
	// task 5
	
	int  num = 100;
	String str = "zero";
	
	if (num >0) {
		str = "positive";
		System.out.println(num + " is "+ str ); //same with == or negative
	}
		
	
	int number2=5000;
    
    if(number2 > 0  ) {
        
        System.out.println("Positive");
    }
    if(number2 < 0) {
        System.out.println("Negative");
    }
    if(number2 ==0 ) {
        System.out.println("Zero");
    }
	
	
	
	
	
		
		
		
		}
		
		
		
			
			
			
			
		
		}
	
	
	
	

