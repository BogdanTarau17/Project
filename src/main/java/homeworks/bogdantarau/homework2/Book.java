package homeworks.bogdantarau.homework2;
import lombok.*;

public class Book {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private int year;

    @Getter @Setter
    private Author author;

    @Getter @Setter
    private double price;

    public Book(String name, int year, Author author, double price) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;
    }

}