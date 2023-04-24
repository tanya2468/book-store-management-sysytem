import java.util.ArrayList;
import java.util.*;


class Book {
    String title;
    String author;
    int id;

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ID: " + id;
    }
}

class BookManagementSystem {
    static ArrayList<Book> books = new ArrayList<Book>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("Book Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Search Book");
            System.out.println("4. View All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    deleteBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    viewAllBooks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    public static void addBook() {
        System.out.print("Enter book title: ");
        String title = sc.next();
        System.out.print("Enter book author: ");
        String author = sc.next();
        System.out.print("Enter book ID: ");
        int id;
        try {
            id = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer value for the book ID.");
            sc.nextLine();
            return;
        }
        books.add(new Book(title, author, id));
        System.out.println("Book added successfully.");
    }
    public static void deleteBook() {
        System.out.print("Enter book ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id == id) {
                books.remove(i);
                System.out.println("Book deleted successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void searchBook() {
        System.out.print("Enter book ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id == id) {
                System.out.println(books.get(i));
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void viewAllBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }
}
