package Day_6_AutomaticOperators;

public class Assignments_AutomaticOperators {
	
	public static void main(String[] args) {
	
	System.out.println((5+2)*4);// 28	
	System.out.println(10/5-3);	//-1
	System.out.println(8+12*(6-2)); //56
	System.out.println((4+17)% 2-1); //0
	System.out.println((6-3)*(2+7)/3); //9
		
	// Task 1
	
	int length = 23;
	int width = 18;
	int sum = length+width;
	System.out.println(length+width);//41
	 
	//  Task 2
	
	double Farenheit = 95;
	long Celsius = (int) Farenheit; 
	System.out.println(Celsius); //95   //we have formula (95°F − 32) × 5/9
	System.out.println((95-32)* 5/9); //35
	
	// Task 3
	
	double mile = 1;
	float kilometer = (float) mile;
	System.out.println(1*1.609344); 
	
	// Task 1 
	double perimeter = 2,
	        radius = 5.5f,
	        Pi = 3.14,
	        area = perimeter*radius*Pi; 
	System.out.println(perimeter*radius*Pi); //34.54
	
	// Task 2 
	
	double width1 = 4.5;
	double height = 7.9;
	double area1 = width1*height;
	System.out.println(width1*height); //35.55
	
	// Task 3 
	int a, b, c, average;
	a = 4;
	b = 3;
	c = 2 ;
	average = ( a + b + c ) / 3;
	System.out.println((a + b + c)/3); //3
	
	// Task 1
	
	int pies=10, people = 4;
	double piesPerson;
	piesPerson=pies/people;
	System.out.println(piesPerson);//2.0
	
	// Task 2
	int pies1=10, people1 = 4;
	double piesPerson1;
	piesPerson1=(double)pies1/people1;
	System.out.println(piesPerson1); //2.5
	
	int pies2=10, people2 = 4;
	double piesPerson2;
	piesPerson2=pies2/(double)people2;
	System.out.println(piesPerson2); //2.5
	
	
	int pies3=10, people3 = 4;
	double piesPerson3;
	piesPerson3= (double)(pies3/people3);
	System.out.println(piesPerson3); // 2.0
			
	//Task
	
	System.out.println((int)(7.9)+(int)(6.7)); //13
	System.out.println((int)(7.9+6.7));//14
	System.out.println((double)(17));//17.0
	System.out.println((double)(8+3));//11.0
	System.out.println((double)(7)/2); //3.5
	System.out.println((double)(7/2));//3.0
	System.out.println((int)7.8+(double)(15)/2);//14.5
	
	
	
	
	
		
		
		
		
		
		
	}
	
	

}
