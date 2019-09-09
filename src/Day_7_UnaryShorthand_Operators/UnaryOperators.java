package Day_7_UnaryShorthand_Operators;

public class UnaryOperators {

public static void main(String[] args) {
	
	/* positive +
	 * negative -      
	 * increment ++
	 * decrement --
	 */
	int a =10;
	int b = -10; 
	System.out.println(b); //-10    +- ---> -, ++ --> +, -- > +
	
	int c = +b; //+(-10) //-10
	int d = -c; // -(-10) //+10
	
	/*increment increases the value by 1
	 * pre increment - operator is placed before variable */
	int num1 = 100;
	System.out.println(++num1); //100 + 1 = 101, increase by 1 immediately
	
	// post increment placed after variable, increase value by 1 later not immidiately
	int x = 100;
	
	int y = x++;
	// y = 100;
	System.out.println(y++);//100
	System.out.println(y);//101
	
	/* decrement decreases the value by 1
	pre decrement placed before variable, decreases immediately*/
	
	int Z = 100;
	Z --;

	System.out.println(Z); //99
	
	/* post decrement placed after variable, pass the current value,then decrease it by 1*/
	int Y = 95;
	System.out.println(Y--); //95, decrease at next step
	System.out.println(Y); //94 
	
	int P = 50;
	P= --P + P++ + P-- + P++;
	// 49 +  49 +  50 +   49;
	//   98      +    99 = 197
	System.out.println(P); //197
	
	short Snum =4; 
	int R = Snum * 4 - Snum--;
	//            16 -  4 = 12

	System.out.println(R); //12
	
	int W = 1;
	    W = - W--+ W++/ -W-- * --W;
	    //   -1  + 0  / -1   * -1
	    //    -1 + 0 * -1
	    //     -1 + 0
	    //     -1
System.out.println( W);
}
	
}
