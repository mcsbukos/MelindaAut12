package w3resource.oop;

public class Book {
    String name;
    int year;
    Author author;
    double price;

    public Book(String name, int year, Author author, double price) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;
    }

    String getName(){
        return name;
    }
    Author getAuthor(){
        return author;
    }

    double getPrice(){
        return price;
    }
    int getYear(){
        return year;
    }
}

