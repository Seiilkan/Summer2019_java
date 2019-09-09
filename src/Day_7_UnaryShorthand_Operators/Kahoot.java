package Day_7_UnaryShorthand_Operators;

public class Kahoot {

	public static void main(String[] args) {
		//1 
		int a = 30;
		int b = (int) a;
		System.out.println(b);
		
		//2 Compiler error because syso need to come later than int a = 1
		
		//3 
		System.out.println("result A"+0+1); //Is it String: text or number?
		System.out.println("result B"+(1)+(2)); // So, Result A01, Result B12
		
		//4
		System.out.println("5+2="+3+4);//text 5+2=34 +numbers
		
		//5
		float FloatNum = 100.98765432F;
		short ShortNum = (byte) FloatNum; // 100	
		System.out.println(ShortNum);
		
		// 6
		// byte BNUm = 200; it is an error, coz range is -128 to 127
		
		//7
		System.out.println((3+2)*2/3%2);
		                //   5*2/3%2
		                //   10/3%2
		                //    3%2   -- 1
		
		
		// 8 Denominator can not to be 0
		
		//9 
		long a1 = 3_000L;
		double b1 = (float) a1;
	    int Inum = (short)b1;
		
		System.out.println(b1); //3000.0
		System.out.println(Inum %1000); //0
		
		//10
		
		double result1= 10/3;
		System.out.println(result1); //3.0
		
	//11
		System.out.println(10.0/3); //3.333333 // if decimal - result decimal too
		System.out.println(10/3); // 3
		
		//12 
		
		String str ="10.5"; // it is not primitive, so, it is not compile
		// int num = (int) str; DOES NOT COMPILE
		
		//13
		int I1=10, I2=20, I3 =30;
		I1 = I1%5;//0
		I2 = I2%5;//0
		I3= I3%5; //0 
		//0=0+0

		
	
		
	}
	
	
	
	
	
	
}
