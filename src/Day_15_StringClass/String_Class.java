package Day_15_StringClass;

public class String_Class {

	public static void main(String[] args) {
		
	
	String str = "cat";
	String A = "cat";
	String B = "cat";
	System.out.println(A==B);  // true, String was stored in String pool, so there is one memory location
	
	String str1 = new String ("cat");
	System.out.println(str == str1);// false, because every new string takes duplicates, they are all new
	
	String str2 = new String ("cat");
	System.out.println(str1 == str2); //false
	
	
	
	
	
	
	
	
	}
		

	}

