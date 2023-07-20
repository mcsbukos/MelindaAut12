package w3resource.oop;

public class Library {
    public static void main(String[] args) {
        Author author = new Author("Miklos", "miklos@mail.com");
        Book book = new Book("A rozsa neve ", 1980, author,79.9);

        System.out.println(" The book's title is: " + book.getName() + " the price is: " + book.getPrice() + " The author name is: " + book.getAuthor().getName() + " published in: "+ book.getYear());
    }
}
