package lab2 ;

import java.util.InputMismatchException ;
import java.util.Scanner ;

class Studentttt {
    private String name ;
    private int midtermScore ;
    private int finalScore ;

    public Studentttt(String name, int midtermScore, int finalScore) {
        this.name = name ;
        this.midtermScore = midtermScore ;
        this.finalScore = finalScore ;
    }

    public double calculateAverage() {
        return (midtermScore + finalScore) / 2.0 ;
    }

    public String getStatus(double passMark) {
        double average = calculateAverage() ;
        return (average >= passMark) ? "Pass" : "Fail" ;
    }

    public void displaySummary(double passMark) {
        double average = calculateAverage() ;
        String status = getStatus(passMark) ;
        System.out.printf("Name: %s%n", name) ;
        System.out.printf("Average Score: %.2f%n", average) ;
        System.out.printf("Status: %s%n", status) ;
    }
}

public class lab2_4 {
    public static void main(String[] args) {
        final double PASS_MARK = 50.0 ;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Name: ") ;
            String name = scanner.nextLine() ;

            System.out.print("Enter Midterm Scores (0-100): ") ;
            int midtermScore = readScore(scanner) ;

            System.out.print("Enter Final Scores (0-100): ") ;
            int finalScore = readScore(scanner) ;

            Studentttt student = new Studentttt(name, midtermScore, finalScore) ;
            System.out.println("\n--- Summary of results ---") ;
            student.displaySummary(PASS_MARK) ;
        } catch (InputMismatchException e) {
            System.out.println("Please Enter an Integer") ;
        }
    }

    private static int readScore(Scanner scanner) {
        int score = scanner.nextInt() ;
        if (score < 0 || score > 100) {
            throw new InputMismatchException() ;
        }
        return score ;
    }
}
