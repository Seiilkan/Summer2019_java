package Day_6_AutomaticOperators;

public class PrimitiveCasting {
	
	// Primitive casting is converting larger primitive to smaler size
	
	public static void main(String[] args) {
		
		int a =128;
		byte b = (byte) a; // explicit casting //shound be within a range of byte -128 to 127
		System.out.println(b); //-128
		
		int a1 = 10;
		byte b2 = (byte) a1; // explicit casting 
		System.out.println(b2); //10
		
		double DecimalNumber= 10.5;
		float FloatNumber= (float) DecimalNumber;
		
		System.out.println(FloatNumber); // 10.5
		 
		double DecimalNumber1= 10.5;
		float FloatNumber1= (int) DecimalNumber1;
		System.out.println(DecimalNumber1); //10.0
		
		long LongNum = 300L;
		int IntNum = (int) LongNum;
		
		System.out.println(LongNum);
		
		long Longnum =300L;
		int Intnum = (byte) Longnum; 
		
		System.out.println(Intnum);
		
		
		//implicit casting: 
		 short ShortNum = 100;
		 long LongNum2= ShortNum;
		 
		 System.out.println(ShortNum);
		
		//explicit casting practices:
		 
		 double LargestNumber = 100.8765;
		 byte ByteValue = (byte) LargestNumber;
		 System.out.println(ByteValue); //100 - byte was made for whole numbers
		 
		 double LargestNumber1 = 100.8765;
		 float FloatValue = (float) LargestNumber1;
		 System.out.println(FloatValue);//100.8765
		 
		 float FloatValue2 = (int) LargestNumber1;

		 System.out.println(FloatValue2);// 100.0
		 
		 float FloatValue3 = (byte) LargestNumber1;

		 System.out.println(FloatValue3); //100.0
		 
		 float FloatValue4 = (short) LargestNumber1;

		 System.out.println(FloatValue4); //100.0
		
		
		 float Floatnumber = 500.67F;
		 int mynumber = (short) Floatnumber;
		 int mynumber1 = (int) Floatnumber;   //no long 
		 
		 System.out.println(mynumber); //500 
		 System.out.println(mynumber1);//500
		 
		 
		 
		 
		 
		 
		 
		
		
	}

}
