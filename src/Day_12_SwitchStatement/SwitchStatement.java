package Day_12_SwitchStatement;

public class SwitchStatement {
	
	public static void main(String[] args) {
	
		
		String str = "Java";
		
		switch (str) {
		
		
		case "C#":
			System.out.println("C# programming Language");
			break; // case was closed
		case "Python":
			System.out.println("Python programming language");
		default:
			System.out.println("Invalid");		
		
			}
		
	char grade = 'A';
	
	switch(grade) {
	

	
	case'B': 
	System.out.println("Passed with B");
	break;
	case 'C': 
		System.out.println("Passed with A");
	// Switch only exist if there are {} or break
	default: // the place of Default the result can change
		System.out.println("Failed");
	
	}
			
			
			}
		
		
		
		
		
		
		
	}


