package lab1_1;

import java.util.Scanner ;

public class lab1_3 {

    public static void main(String[] args) {
        
        int n = 0 ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;
        System.out.print( "Enter Number : " ) ;
        
        if( input.hasNextInt()) {
            n = input.nextInt() ;
            InputNotcorrect = false ;
            input.close() ;
        }
        
        if( InputNotcorrect == false ){
            if( n % 2 == 0 ){
            System.out.println( "Result : " + n + " is Even" ) ;
            }else{
            System.out.println( "Result : " + n + " is Odd" ) ;
            }
        }
    }
}