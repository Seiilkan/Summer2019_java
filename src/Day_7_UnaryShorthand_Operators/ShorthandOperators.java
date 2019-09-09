package Day_7_UnaryShorthand_Operators;

public class ShorthandOperators {

	private static final int D1 = 0;

	public static void main(String[] args) {
		
		/* += addition x+=y   
		
		*/

		int a =9;
		    a = a+3;
		    System.out.println(a); //12
		    
		 
		double b = a+=5; //12+5=17
		System.out.println(a);//a=17, b+17
		
		int c = a+=b;
		//     17+=17=34
		System.out.println(c); //c=34, a= 34, b=17
		
		int d= a+=c; // 34+34= 68
		System.out.println(d);// d= 68, a= 68, c = 34, b =17
		
		int e = (d+=b) *2;
		//      (68+17)*2;
		//       85*2 = 170
		System.out.println(e); //170, d= 85, b = 17, e = 170
		System.out.println(d); //85
		System.out.println(c); //34
		System.out.println(b); //17
		
		//substraction
		
		int g = 101;
		int h = g -=1;
		System.out.println(h); //101-1=100; g =100, h = 100
		
		int i = g+=h+5;
		System.out.println(i); //100+100+5= 205
		
		int j = h+= g%i;
			//100+=205%205
		    //100+= 0
		System.out.println(j);//100
		
		int k = j -= h*2%5;
		//      J =  200%5=0
		//   100-= 0
		System.out.println(j); //100
		
		
		// multiplication x*=y --> x= x*y
		
		int A = 100;
		A*=200; //2000
		System.out.println(A); //2000
		
		int B = 100;
		B*= 100/10;
	// 100*100/10	
		System.out.println(B); //1000
		
		B *= B-=1000;
		System.out.println(B); //0
		
		// division /=
		
		int C = 1000;
		C /= 5;
		System.out.println(C);//200
		
		// C/= D -10; denominator can not to be equal to 0
		
		C /= D1+10; 
		
		System.out.println(C); //20
		
		//Remainder x%=y // reminder can not be negative
		
		int z =10%3;
		
		int E = 10;
		E %=2; // E = 10%2
		System.out.println(E); //0
		
		int F = 100;
		F%=2; 
		System.out.println(F); //0 even number
		
		int J = 300;
		int K = 10;
		
		J+=J%=K; //300%10 =0; 300+0=300
		System.out.println(J); //300
		
		
		
		
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
