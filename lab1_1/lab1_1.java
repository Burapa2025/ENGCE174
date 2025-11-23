
package lab1_1;

import java.util.Scanner;

public class lab1_1 { // ชื่อคลาสควรใช้ตัวใหญ่ต้นคำตาม convention
    public static void main(String[] args) {

        double width = 0;
        double height = 0;
        double area;
        boolean isInputValid = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Number or Decimal");
        System.out.print("Enter width (cm): ");

        if (input.hasNextDouble()) {
            width = input.nextDouble();

            System.out.print("Enter height (cm): ");

            if (input.hasNextDouble()) {
                height = input.nextDouble();
                isInputValid = true;
            } else {
                isInputValid = false;
                System.out.println("Enter only Number or Decimal!!!");
            }
        } else {
            isInputValid = false;
            System.out.println("Enter only Number or Decimal!!!");
        }

        input.close();

        if (isInputValid) {
            area = width * height;
            System.out.printf("Area: %.2f cm²%n", area);
        }
    }
}
