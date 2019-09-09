package Day_7_UnaryShorthand_Operators;

public class RelationalOperators {
	
	public static void main(String[] args) {
		
		/* Relational operators returns boolean expression
		 > greater than
		 >= greater than or equal
		 <  less than
		 <= less than or equal
		 == equal
		 != not equal
		 ! = not
		 =: assign
	*/
		System.out.println(10>9); //true
		boolean A = 10>9;
		System.out.println(A);
		
		System.out.println(10>=9); // as soon as one of greater or equal is right is gonna return true
		                           
		boolean B = 10>=9; 
		System.out.println(B); //true
		
		boolean C = 10<= 9; // less than or equal
		System.out.println(C);  //false
		
		boolean E = 1000<1000;
		System.out.println(E); // false, they are equal
		
		boolean F = 1000<=1000; //true, = is match
		
		boolean L = 19==19;
		System.out.println(L); //true
		
		boolean H = 20!= 20;
		System.out.println(H); //false 
		
		// !(not)false equal to true. !true is equal to false.
		
		
		
		
		
		
		
	}

}
