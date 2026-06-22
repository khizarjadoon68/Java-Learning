package LibrarySystem;

class Book {
    String bookName;
    String author;

    Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }
    public void displayBook() {
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
    }
}

class HardBook extends Book {

    HardBook(String bookName, String author) {
        super(bookName, author);
    }
    @Override
    public void displayBook(){
        System.out.println("BookType : HardBook");
        super.displayBook();
    }
}
class SoftBook extends Book {

    SoftBook(String bookName, String author) {
        super(bookName, author);
    }
    @Override
    public void displayBook(){
        System.out.println("BookType : SoftBook");
        super.displayBook();
    }
}
public class Books {
    public static void main(String[] args){

        HardBook h1 = new HardBook("Code ","Charles Petzold");
        SoftBook s1 = new SoftBook(" Eloquent JavaScript","Marijn Haverbeke");

        h1.displayBook();
        s1.displayBook();
    }
}