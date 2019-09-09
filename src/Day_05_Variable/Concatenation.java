package Day_05_Variable;

public class Concatenation {

	// String represents the sequences of characters used for storing text, with ""
	
	public static void main(String[] args) {
		
		String str = "any text goes here";
		System.out.println(str);
		
	String str2 = "1"; // assigns it as a text: HelloWorld is String value too.
	
	System.out.println(str2);
	
	//Concatenation combines linking things together --> create String value
	
	String myName = "Cybertek" + " school";
	System.out.println(myName);
	
	String Year = "this is" +" 2019";
	System.out.println(Year );
	
	
	// example
	String name = " Seiilkan";
	System.out.println("My Name is"+name);
	
	int cucumber = 3; int tomato = 5;
	System.out.println("cucumber is " +  cucumber + " $");
	System.out.println("tomato is" + " $" + tomato);
	
	
	String newStr = "100"+10;
	System.out.println(newStr); //10010  
	
	System.out.println(1+2+3); //it is calculation 6
	
	System.out.println("1"+2+3); //123 if there is one text, they gonna be as a text
	
	//System.out.println("1"+1-3);// "11'-3 
	
	System.out.println("123" + (4+5)); //1239
	
	System.out.println("Batch 12" +1 +2); //Batch 1212
	
	System.out.println(1+("1"+2)); //112
	System.out.println(1+"123"+ (4+5)); //11239
	System.out.println(4+3 - (9+3)); //-5 = (7-12)
	
	System.out.println("3" + '3');//33 String to Chart 3+3= 33
	System.out.println('3'+3); //54 = 3+51-Number of 3 in Ascii table 
	System.out.println("3"+ 3); // 33
	System.out.println(3+3); //6
	
	
	
	}
}
