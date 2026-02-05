// Library Management System
// Author: CodeNestJava
// Description: Console-based Java application using OOP

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Book ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Book Title: ");
                String title = scanner.nextLine();

                System.out.print("Enter Book Author: ");
                String author = scanner.nextLine();

                books.add(new Book(id, title, author));
                System.out.println("Book added successfully!");

            } else if (choice == 2) {

                if (books.isEmpty()) {
                    System.out.println("No books available.");
                } else {
                    System.out.println("\n--- Library Books ---");
                    for (Book book : books) {
                        System.out.println(
                                "ID: " + book.getId() +
                                ", Title: " + book.getTitle() +
                                ", Author: " + book.getAuthor() +
                                ", Issued: " + (book.isIssued() ? "Yes" : "No")
                        );
                    }
                }

            } else if (choice == 3) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
