package Day_13_Review;

public class AssessmentQuiz {

	public static void main(String[] args) {
        // Q1:
        
        int num = 9;

        if(num++ == 10) { // line 1   num = 10
        //  9  == 10 ==>  false  
            System.out.println("Hello World "+num);    // line 2
        }
        else {
            System.out.println("Hello Universe "+num);  // line 3
            //                                   10
        }
        
        
    // Q2:  
        
        int score=0;
   if(true) {
        if(score == 0) {
            // 0 ==0 => true
                score += 50; //  score =50;
        }
         if(score !=0 ) {
        //  50 != 0 ==> true
            score +=50;  // 50 += 50 ==> 100;
        }
   }

        System.out.println(score);
        
        
        // Q3:
        char grade ='A';
        boolean Passed = grade == 'A' || grade =='B';
        //                  'A'=='A'  ||  'A' == 'B'
        //                    true    ||   false  ==> true
        
        boolean Passed2 = grade == 'C' || grade =='D'; 
        //                 'A' == 'C'  ||  'A' == 'D';
        //                  false      ||    false  ==> false    

        if( Passed || Passed2) {
        //   true  || false  ==>  true   
            System.out.println("You've passed the exam");
        }
        else {
            System.out.println("You failed");
        }
        
        
        // Q4:
        
        boolean A = true, B =  !false;
        //                B = true

            if( B ) {
                // true
                System.out.println("B");
            }
            else if(  A ) {
                // true
                System.out.println("A");
            }
             else {
                System.out.println("C");
            }

	}
}