package Day_6_AutomaticOperators;

public class AutomaticOperators {

	public static void main(String[] args) {
		/*+ addition, adds two numbers together
		   - substraction
		   + multiplication
		   / devision devides
		   % remainder
		
		*/ 
		
		int a = 100;
		int b = a-400; //100-400=-300
		
		System.out.println(b); //-300
		
		double length = 100,
				wedith =10,
				area = length/wedith;
		System.out.println(area); //10.0
		
		System.out.println(3+5+4-2); //10
		//                  8+4-2 = 10
		
		//double resultNum = 9/0; // denominator cannot be zero
		
		//short Num1 = 10/3; // do not except decimals
		
		double Num1 = 10 /3.0 ;  //3.33333
		double Num2 = 10/3; //3.0
		System.out.println(Num2); //3.0
		
		int output = 12 + 6/3; //devisi0n, multiplication, remainder% go first 6/3=2 + 12 = 14
		System.out.println(output); //14
		
		System.out.println(5+2*4); //13
		System.out.println(10/2-3); //2
		System.out.println(8+12*2); //32
		 
		/* % 10/3 -- 3 with remainder of 1
		 *   12/5 --- 1
		 * 
		 * 
		 *  even number -- can be divided by 2 without remainder
		 *  odd numder -- divided by 2, will have a remainder
		 *  
		*/
		int oddnum = 20%2; //even
		int oddnum1 = 45%2; // odd remainder 1
		int oddnum2 = 65%2; // odd remainder 32
		System.out.println(oddnum2);// if 0 it is even, if not 0 it is odd
		
		System.out.println(4+17 % 2-1);
		//                 17%2 = 1, 4+ 1 -1 = 4
		
		System.out.println(6-3*2 +7-1); //6   3*2 =6 -6=0 +7 =7 -1= 6
		
		System.out.println(6*3/2); //9
		
		System.out.println(1+2 - 2+3); //4
		System.out.println(1+2 - (2+3)); //-2
		
		System.out.println(3+4*4+5*(4+3)); // first see braces, multiplication,then together
		//                 3+*4+5*7
		//                 3+16+35
		//                 19 +35=54
		
		
		// 10/4 -- 2 with remainder (10 - 2*4denominator)= 2, in Java we have %
		
		System.out.println(10%4); //2
		
		System.out.println((4+17)% 2-1);// 4+17 = 21, 21%2= 1, 1-1=0 //0
		
		
	}
	
		
	
}
