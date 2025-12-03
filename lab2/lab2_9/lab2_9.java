package lab2.lab2_9 ;

import java.util.Scanner ;

class Address {
    private final String street ;
    private final String city ;
    private final String zipCode ;

    public Address(String street, String city, String zipCode) {
        this.street = sanitize(street) ;
        this.city = sanitize(city) ;
        this.zipCode = sanitize(zipCode) ;
    }

    private String sanitize(String s) {
        return s == null ? "" : s.trim() ;
    }

    public String getFullAddress() {
        return street + ", " + city + ", " + zipCode ;
    }
}

class Student {
    private final String name ;
    private final Address address ;

    public Student(String name, Address address) {
        this.name = name == null ? "" : name.trim() ;
        this.address = address ;
    }

    public void displayProfile() {
        System.out.println("Name: " + name) ;
        System.out.println("Address: " + address.getFullAddress()) ;
    }
}

public class lab2_9 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Name: ") ;
            String name = readNonEmptyLine(input) ;

            System.out.print("Enter Street: ") ;
            String street = readNonEmptyLine(input) ;

            System.out.print("Enter City: ") ;
            String city = readNonEmptyLine(input) ;

            System.out.print("Enter ZipCode: ") ;
            String zipCode = readNonEmptyLine(input) ;

            Address userAddress = new Address(street, city, zipCode) ;
            Student student = new Student(name, userAddress) ;
            student.displayProfile() ;
        }
    }

    private static String readNonEmptyLine(Scanner scanner) {
        String line ;
        while (true) {
            line = scanner.nextLine().trim() ;
            if (!line.isEmpty()) return line ;
            System.out.print("Please enter a non-empty value: ") ;
        }
    }
}
