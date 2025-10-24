package Book2;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void removeBook(String title) {
        Book toRemove = null;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                toRemove = book;
                break;
            }
        }
        if (toRemove != null) {
            books.remove(toRemove);
            System.out.println("Removed book: " + title);
        } else {
            System.out.println("Book titled '" + title + "' not found.");
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            System.out.println("Books in library:");
            for (Book book : books) {
                System.out.println("- " + book.getTitle());
            }
        }
    }
}
