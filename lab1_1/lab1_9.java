package lab1_1 ;

import java.util.Scanner ;

public class lab1_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int size = 0 ;
        boolean validSizeInput = false ;

        while(!validSizeInput) {
            System.out.print("Please Enter Number (For Make Array Size) : ") ;
            if(input.hasNextInt()) {
                size = input.nextInt() ;
                if(size > 0) {
                    validSizeInput = true ;
                    System.out.println("Array Size (N) is: " + size) ;
                }else{
                    System.out.println("Enter only positive number (> 0).") ;
                }
            }else{
                System.out.println("Enter only Number.") ;
                input.next();
            }
        }

        int[] n = new int[size] ;

        for (int i = 0; i < size; i++) {
            boolean validElement = false ;
            while (!validElement) {
                System.out.print("Enter N[" + (i + 1) + "]: ") ;
                if (input.hasNextInt()) {
                    n[i] = input.nextInt() ;
                    validElement = true ;
                }else{
                    System.out.println("Enter only Number.") ;
                    input.next() ;
                }
            }
        }

        int sum = 0;
        for (int value : n) {
            sum += value ;
        }

        float avg = (float) sum / n.length ;
        System.out.println("N Average is: " + avg) ;
        input.close() ;
    }
}