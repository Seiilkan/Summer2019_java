package Day_15_StringClass;

public class StringMethods {

	
	
	public static void main(String[] args) {
		
	// str.length();	
	String name = "Donald J Trump";
	
	int n = name.length();
	System.out.println(n);	// calculate a length of String
	
	
	// str.charAt();
	String str = "Seiilkan";
//  index nums    01234567
	System.out.println(str.charAt(1)); // e 
	
	// immutable - unchanging
	
	
	// str.concat
	
// concat is a mixing
	
	String s1 = "Cybertek";
	System.out.println(s1);
	s1.concat("School");
	
	s1 = s1.concat(" School"); // we join Cybertek and school with str.concat("");
	
	System.out.println(s1);
	
	
	// toUpperCase():
	
	String N = "cybertek";
			N.toUpperCase();
	System.out.println(N); //cybertek
	
	N = N.toUpperCase();
	System.out.println(N); //CYBERTEK
	
	
	// toLowerCase
	
	String name1 = "SEIILKAN";
	
	name1 = name1.toLowerCase();
	System.out.println(name1); // seiilkan
	
	// Practice
	
	//str.charAt();
	
	String a = "Javangers";
	//          012345678
	
	System.out.println(a.charAt(3)); //a
	//or
	char ch = a.charAt(8);
	System.out.println(ch); // s
	
	int Length = a.length();
	System.out.println(Length);
	
	
	
	
	}
}
