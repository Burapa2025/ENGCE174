package lab1_1;

import java.util.Scanner ;

public class lab1_7 {
    
    public static int sumArray( int[] array ) {
        int sum = 0 ;
        for( int i=0 ; i<array.length ; i++ ) {
            sum += array[i] ;
        }
        return sum ;
    }

    public static void main(String[] args) {
        int sum ;
        int n = 0 ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;
        System.out.print( "Please Enter Number of Array : " ) ;
        
        if( input.hasNextInt()) {
            n = input.nextInt() ;
            InputNotcorrect = false ;
        }else{
            System.out.println("Enter only Number" ) ;
        }
        
        if( InputNotcorrect == false ){
            int[] array = new int[n] ;
            for( int i=0 ; i<n ; i++ ) {
                System.out.print( "Enter Array [" + (i+1) + "] : " ) ;
                if( input.hasNextInt()) {
                    array[i] = input.nextInt() ;
                }else{
                    System.out.println("Enter only Number" ) ;
                    InputNotcorrect = true ;
                    input.close() ;
                    break ;
                }
            }
        
            if( InputNotcorrect == false ) {
                sum = sumArray( array ) ;
                System.out.println( "Sum Array is : " + sum ) ;
            }
        }
    }
}