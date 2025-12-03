package lab2;

import java.util.Scanner;

class Student {
    String studentId;
    String name;
}

public class lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        Student student = new Student();
        student.studentId = studentId;
        student.name = name;

        System.out.println("Student ID: " + student.studentId);
        System.out.println("Student Name: " + student.name);

        scanner.close();
    }
}
