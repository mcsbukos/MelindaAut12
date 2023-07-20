package w3resource.oop;

import java.util.ArrayList;

public class BookW3App {
    public static void main(String[] args) {
        BookW3 book1 = new BookW3("A rozsa neve", "Umberto Eco", "ISBN0001");
        BookW3 book2 = new BookW3("The Great Gatsby", "F S Fitzgerald", "ISBN9785");
        BookW3 book3 = new BookW3("The name of Rose", "Eco", "ISBN002356");
        BookW3.addBook(book1);
        BookW3.addBook(book2);
        BookW3.addBook(book3);
        ArrayList <BookW3> bookCollection = BookW3.getBookCollection();
        System.out.println("lists of books");
        for (BookW3 book:bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }
        BookW3.removeBook(book1);
        System.out.println("after removing " + book1.getTitle() + ": ");
        System.out.println("List of books:");
        for (BookW3 book: bookCollection){
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " , ISBN: " + book.getIsbn());
        }

    }

}
