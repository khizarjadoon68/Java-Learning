package LibrarySystem;

class Book {
    String bookName;
    String author;
    String type;   // Hard or Soft

    Book(String bookName, String author, String type) {
        this.bookName = bookName;
        this.author = author;
        this.type = type;
    }

    public void displayBook() {
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
        System.out.println("Book Type : " + type);
    }
}

class HardBook extends Book {

    HardBook(String bookName, String author) {
        super(bookName, author, "Hard Book");
    }

}
class SoftBook extends Book {

    SoftBook(String bookName, String author) {
        super(bookName, author, "Soft Book");
    }

}
public class Books {
    public static void main(String[] args){

        HardBook b1 = new HardBook("Code ","Charles Petzold");
        SoftBook b2 = new SoftBook(" Eloquent JavaScript","Marijn Haverbeke");

        b1.displayBook();
        b2.displayBook();
    }
}