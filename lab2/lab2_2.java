package lab2 ;

import java.util.Scanner ;

class Studentt {
    String studentId ;
    String name ;

    void displayInfo() {
        System.out.println("Student ID: " + studentId) ;
        System.out.println("Student Name: " + name) ;
    }
}

public class lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Enter student ID: ") ;
        String studentId = scanner.nextLine() ;

        System.out.print("Enter student name: ") ;
        String name = scanner.nextLine() ;

        Studentt student = new Studentt() ;
        student.studentId = studentId ;
        student.name = name ;

        student.displayInfo() ;

        scanner.close() ;
    }
}
