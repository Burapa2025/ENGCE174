package lab2 ;

import java.util.Scanner ;

class Studenttt {
    private String studentId ;
    private String name ;
    public static int studentCount = 0 ;

    public Studenttt(String id, String n) {
        this.studentId = id ;
        this.name = n ;
        studentCount++ ;
    }

    public String toString() {
        return "StudentID=" + studentId + ", Name=" + name ;
    }
}

public class lab2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Number of Students: ") ;
        int N = input.nextInt() ;
        input.nextLine() ;

        for (int i = 0; i < N; i++) {
            System.out.print("Enter StudentID: ") ;
            String studentId = input.nextLine() ;

            System.out.print("Enter Student Name: ") ;
            String name = input.nextLine() ;

            Studenttt Student = new Studenttt(studentId, name) ;
        }

        System.out.println("Total Students: " + Studenttt.studentCount) ;
        input.close() ;
    }
}