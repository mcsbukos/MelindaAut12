package ro.homework.homework03;

public class Library {
    public static void main(String[] args) {
        // Create an author
        Author author = new Author("Umberto Eco", "ueco@example.com");

        // Create a book
        Book book = new Book("The Name of the Rose", 1980, author, 70.99);

        // Print the book's details
        System.out.println("Favorite book: " + book.getName() + ", by " + book.getAuthor().getName() + ", published in " + book.getYear() + ", price: " + book.getPrice() + " RON"  );
    }

}
