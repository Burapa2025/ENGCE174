package lab1_1 ;

import java.util.Scanner ;

public class lab1_1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(" กรอกตัวเลข a : ") ;
            int a = sc.nextInt() ;

            System.out.print(" กรอกตัวเลข b : ") ;
            int b = sc.nextInt() ;

            int sum = a + b ;
            System.out.println( "ผลรวม = " + sum ) ;
        }
    }
}
