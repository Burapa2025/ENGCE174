package lab1_1 ;

import java.util.Scanner ;

public class lab1_10 {

    public static double calculateArea(double width, double height) {
        return width * height ;
    }

    public static void main(String[] args) {
        System.out.println("Calculate Area of Rectangle") ;

        try (Scanner input = new Scanner(System.in)) {

            double width = readPositiveDouble(input , "Enter Width : ") ;
            double height = readPositiveDouble(input , "Enter Height : ") ;

            double area = calculateArea( width, height ) ;
            System.out.printf("Area is: %.2f%n", area) ;
        }
    }

    private static double readPositiveDouble(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt) ;
            if (input.hasNextDouble()) {
                double value = input.nextDouble() ;
                if (value > 0) {
                    return value ;
                }else{
                    System.out.println("Please enter a number greater than 0") ;
                }
            }else{
                System.out.println("Enter only number") ;
                input.next() ;
            }
        }
    }
}
