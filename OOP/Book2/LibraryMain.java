package Book2;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("World War Z"));
        library.addBook(new Book("ZombieLand"));
        library.addBook(new Book("scout guide to the zombie apocalypse "));

        library.displayBooks();

        library.removeBook("World War Z");
        library.removeBook("ZombieLand"); 

        library.displayBooks();
    }
}
