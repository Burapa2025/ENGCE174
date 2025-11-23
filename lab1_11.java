package lab1_1 ;

import java.util.Scanner ;

public class lab1_11 {

    public static int sumArray(int[] array) {
        int sum = 0 ;
        for (int value : array) {
            sum += value ;
        }
        return sum ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Please Enter Number of Array: ") ;

        if (!input.hasNextInt()) {
            System.out.println("Enter only Number") ;
            input.close() ;
            return ;
        }

        int n = input.nextInt() ;

        if (n < 0) {
            System.out.println("Number of Array must be non-negative.") ;
            input.close() ;
            return ;
        }

        int[] array = new int[n] ;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array [" + (i + 1) + "]: ") ;
            if (!input.hasNextInt()) {
                System.out.println("Enter only Number") ;
                input.close() ;
                return ;
            }
            array[i] = input.nextInt() ;
        }

        int sum = sumArray(array) ;
        System.out.println("Sum Array is: " + sum) ;
        input.close() ;
    }
}
