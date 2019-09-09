  package Day_14_ScannerExpressions;

 import java.util.Scanner;

// package name java.util    from Java utility package
                          // class name Scanner
              /* wild import   java.util.*
               imports all classes from java.util package( Java has memory)  
  
  */
  
public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Enter byte value"); // returns the user input as byte value
	byte num = input.nextByte();
	
	System.out.println("enter short Value"); // returns the user input as short value
	short num2 = input.nextShort();
		
		System.out.println("enter int value"); // returns the user input as int value
		int num3 = input.nextInt();
		
		System.out.println("enter long value"); // returns the user input as long value
		long num4 = input.nextLong();
		
		
		System.out.println("enter boolean value"); // returns the user input as boolean value
		boolean num5 = input.nextBoolean();
		
		
		System.out.println("enter float value");
		float num7 = input.nextFloat();
		
		System.out.println("enter double value");
		double num6 = input.nextDouble();
		
		System.out.println("Enter your name");
		String num8 = input.nextLine();
		
		
		
		
		
		
		
		
		
		
	}
	
}
