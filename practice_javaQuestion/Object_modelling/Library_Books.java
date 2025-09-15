package Object_modelling;

import java.util.ArrayList;   // ✅ Import ArrayList
import java.util.List;        // ✅ Import List

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author;
    }
}

class Library {
    private String name;
    private List<Book> books;   // ✅ Aggregation

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        if (books.isEmpty()) {
            System.out.println("No books available");
        } else {
            for (Book b : books) {
                System.out.println(" - " + b);
            }
        }
        System.out.println();
    }
}

public class Library_Books {
    public static void main(String[] args) {
        // Create independent books
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("The Alchemist", "Paulo Coelho");
        Book b3 = new Book("Clean Code", "Robert C. Martin");

        // Create libraries
        Library lib1 = new Library("Central Library");
        Library lib2 = new Library("Community Library");

        // Add books to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);  // same book can exist in multiple libraries
        lib2.addBook(b3);

        // Show books in each library
        lib1.showBooks();
        lib2.showBooks();
    }
}
