package com.program;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Display menu with alignment
        System.out.println("===================================");
        System.out.println("| BOOK MANAGEMENT |");
        System.out.println("===================================");
        System.out.println("| Options: |");
        System.out.println("| 1. Add a book |");
        System.out.println("| 2. View all books |");
        System.out.println("| 3. Search for a book |");
        System.out.println("| 4. Edit a book |");
        System.out.println("| 5. Delete a book |");
        System.out.println("| 6. Exit |");
        System.out.println("===================================");

// Get user input for menu choice
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

// Process user input
        switch (choice) {
            case 1:
                addBook();
                break;
            case 2:
                viewBooks();
                break;
            case 3:
                searchBook();
                break;
            case 4:
                editBook();
                break;
            case 5:
                deleteBook();
                break;
            case 6:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        scanner.close();
    }

    public static void addBook() {
// Implementation of add book feature
        System.out.println("Adding a book...");
    }

    public static void viewBooks() {
// Implementation of view all books feature
        System.out.println("Viewing all books...");
    }

    public static void searchBook() {
// Implementation of search book feature
        System.out.println("Searching for a book...");
    }

    public static void editBook() {
// Implementation of edit book feature
        System.out.println("Editing a book...");
    }

    public static void deleteBook() {
// Implementation of delete book feature
        System.out.println("Deleting a book...");
    }
}
