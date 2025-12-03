package lab2 ;

import java.util.Scanner ;

class Rectangle {
    private double width ;
    private double height ;

    public Rectangle(double width, double height) {
        this.width = width ;
        this.height = height ;
    }

    public double getArea() {
        return this.width * this.height ;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height) ;
    }
}

public class lab2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Width: ") ;
        double width = input.nextDouble() ;

        System.out.print("Enter Height: ") ;
        double height = input.nextDouble() ;

        if (width <= 0 || height <= 0) {
                       input.close() ;
            return;
        }

        Rectangle rect = new Rectangle(width, height) ;

        System.out.printf("Area: %.2f%n", rect.getArea()) ;
        System.out.printf("Perimeter: %.2f%n", rect.getPerimeter()) ;

        input.close() ;
    }
}
