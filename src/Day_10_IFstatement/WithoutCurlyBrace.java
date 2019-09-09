package Day_10_IFstatement;

public class WithoutCurlyBrace {
  public static void main(String[] args) {
	
	 // IF statement without {} can cover only one println 
	  
	  // Better to use with {}
	 
	  if (false)
		  System.out.println("Tommorow is Tuesday"); 
	  // does not print because it is False
	  
	  System.out.println("Today is wonderful day");
	  // PRINTED, because it is not belong to IF statement!!!
	  
	  if (false) //mandatory
	      System.out.println("Hello");
	  // single line of statement
	      else 
		  System.out.println("Hola");
	     // else is not mandatory
	  
	  
	  
	  
}
}
