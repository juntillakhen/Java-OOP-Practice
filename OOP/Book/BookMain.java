package Book;

import java.util.ArrayList;

public class BookMain {
    private static ArrayList<Book> collection = new ArrayList<>();

    public static void addBook(Book book) {
        collection.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public static void removeBook(String isbn) {
        Book bookToRemove = null;
        for (Book book : collection) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove != null) {
            collection.remove(bookToRemove);
            System.out.println("Removed book: " + bookToRemove.getTitle());
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public static void showBooks() {
        if (collection.isEmpty()) {
            System.out.println("Book not found!.");
        } else {
            System.out.println("\nCurrent Book Collection:");
            for (Book book : collection) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("5 Things You Need to Do Before You Die", "Bo Sanchez", "12345");
        Book book2 = new Book("Think Rich Pinoy!", "Larry Gamboa", "67890");
        Book book3 = new Book("Naruto Shippuden", "Masashi Kishimoto", "54321");

        addBook(book1);
        addBook(book2);
        addBook(book3);

        showBooks();

        removeBook("67890");

        showBooks();
    }
}
