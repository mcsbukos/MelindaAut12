package w3resource.oop;

import java.util.ArrayList;

public class BookW3 {
   private String title;
    private String author;
    private String isbn;

    private static ArrayList <BookW3> bookCollection = new ArrayList<>();
    public BookW3(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public static void addBook(BookW3 book){
        bookCollection.add(book);
    }

    public static void removeBook(BookW3 book){
        bookCollection.remove(book);
    }

    public static ArrayList<BookW3> getBookCollection() {
        return bookCollection;
    }
}
