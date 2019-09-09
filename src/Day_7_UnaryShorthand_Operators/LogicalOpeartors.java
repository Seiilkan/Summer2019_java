package Day_7_UnaryShorthand_Operators;

public class LogicalOpeartors {

/*
 *  && : And logic   true && true --> if both of conditions are true, it is gonna be true as a result	
 */// ||  if one of conditions are true, it is gonna be true as a result	
	
	
	public static void main(String[] args) {
		
		boolean Ra = 9==0 && "Mukhtar" == "good";
	
		System.out.println(Ra);
		boolean Rb = 8>5 && 7== (8-2+1);
		System.out.println(Rb);
		
		boolean Rc = !false != true && !false == !(!false);
		//            true  != true &&  true   ==  false
		System.out.println(Rc);
		
		
	// ||  if one of conditions are true, it is gonna be true as a result	
		
		boolean A = !(8>5) || ! ("Today" != "friday");
		    //      !true   || !true  = false
		
		System.out.println(A);
		
		boolean B = true &&true || false;
		System.out.println(B); //true
		
		boolean E =!(7>5 &&  6!=5) && (9>5 || 10>4);
		       //     true   true      true    true
		          // !true         &&   true
		     //      False         &&   true
		System.out.println(E); //false, if there is one false it would be false
		
		
		
		
	}
	
	
}
