package homeworks.bogdantarau.homework2;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("John Doelanescu", "j.doelanescu@folclor.com");
        Author author2 = new Author("Elton John", "elton.j@pop.com");


        Book book = new Book("Ma dusai sa trec la OLt", 1997, author, 39);
        Book book2 = new Book("Insula", 2005, author2, 55);
        Book book3 = new Book("Insula Fericirii", 2001, author, 34);

        System.out.println("First Book Details:");
        System.out.println("Book " + book.getName() + " (" + book.getPrice() + " RON), by " + book.getAuthor().getName() + " email: " + book.getAuthor().getEmail() + ", published in " + book.getYear());
        System.out.println("Second Book Details:");
        System.out.println("Book " + book2.getName() + " (" + book2.getPrice() + " RON), by " + book2.getAuthor().getName() + " email: " + book2.getAuthor().getEmail() + ", published in " + book2.getYear());
        System.out.println("Third Book Details:");
        System.out.println("Book " + book3.getName() + " (" + book3.getPrice() + " RON), by " + book3.getAuthor().getName() + " email: " + book3.getAuthor().getEmail() + ", published in " + book3.getYear());


        author.setName(" Iulian Remorca");
        author.setEmail("i.remorca@sofer.com");
        book.setName("Cum sa conduci camioanele");
        book.setYear(1995);
        book.setPrice(47);
        System.out.println("Fourth Book Details:");
        System.out.println("Book " + book.getName() + " (" + book.getPrice() + " RON), by " + book.getAuthor().getName() + " email: " + book.getAuthor().getEmail() + ", published in " + book.getYear());

        author2.setName(" Vasile Catarg");
        author2.setEmail("Catarg.v@navigatie.com");
        book2.setName("Cum sa conduci vapoarele");
        book2.setYear(1998);
        book2.setPrice(23);
        System.out.println("Fifth Book Details:");
        System.out.println("Book " + book2.getName() + " (" + book2.getPrice() + " RON), by " + book2.getAuthor().getName() + " email: " + book2.getAuthor().getEmail() + ", published in " + book2.getYear());


    }
}
