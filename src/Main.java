// Library Management System
// Author: CodeNestJava
// Description: Console-based Java application to manage library books

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Add Book feature coming soon...");
            } 
            else if (choice == 2) {
                System.out.println("View Books feature coming soon...");
            } 
            else if (choice == 3) {
                System.out.println("Exiting program...");
                break;
            } 
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
