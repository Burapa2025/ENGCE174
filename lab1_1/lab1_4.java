package lab1_1;

import java.util.Scanner ;

public class lab1_4 {
     public static void main(String[] args) {
        
        int score = 0 ;
        String grade = "" ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;
        System.out.print( "Enter Score ( Only Number 1-100 ): " ) ;
        
        if( input.hasNextInt() ) {
            score = input.nextInt() ;
            InputNotcorrect = false ;
            input.close() ;
        }else{
            System.out.println("Enter only Number" ) ;
        }
        
        if( InputNotcorrect == false ){
            if (score >= 0 && score <= 100) {
                if ( score >= 80 ) {
                    grade = " A " ;
                } else if ( score >= 70 ) {
                    grade = " B " ;
                } else if ( score >= 60 ) {
                    grade = " C " ;
                } else if ( score >= 50 ) {
                    grade = " D " ; 
                } else {
                    grade = " F " ;
                }
            }
            System.out.println( "Grade is : " + grade ) ;
        }
    }
}