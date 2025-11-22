package lab1_1 ;

import java.util.Scanner ;

public class lab1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int num1 = readInt(input, "Enter Num1: ") ;
        int num2 = readInt(input, "Enter Num2: ") ;

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result) ;

        input.close() ;
    }

    private static int readInt(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt) ;
            if (input.hasNextInt()) {
                int value = input.nextInt() ;
                return value ;
            } else {
                System.out.println("Enter only Number!!!") ;
                input.next() ;
            }
        }
    }
}
