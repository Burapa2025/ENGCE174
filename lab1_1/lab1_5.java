package lab1_1;

import java.util.Scanner ;

public class lab1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Coffee Menu") ;
        System.out.println("1 = Americano") ;
        System.out.println("2 = Latte") ;
        System.out.println("3 = Espresso") ;
        System.out.println("4 = Mocha") ;
        System.out.print("Invalid Menu (Please enter number 1-4): ") ;

        int select = input.nextInt() ;

        String menu ;
        switch (select) {
            case 1:
                menu = "Americano" ;
                break ;
            case 2:
                menu = "Latte" ;
                break ;
            case 3:
                menu = "Espresso" ;
                break ;
            case 4:
                menu = "Mocha" ;
                break ;
            default:
                menu = "Invalid menu. Please select 1-4." ;
        }

        System.out.println("Your menu choice: " + menu) ;

        input.close() ;
    }
}
