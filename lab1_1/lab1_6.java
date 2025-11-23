package lab1_1;

import java.util.Scanner ;

public class lab1_6 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Multiplication Table: ") ;
        if (!input.hasNextInt()) {
            System.out.println("Only Integer") ;
            input.close() ;
            return ;
        }

        int n = input.nextInt() ;

        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i)) ;
        }

        input.close() ;
    }
}
