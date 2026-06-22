package LibrarySystem.Books;

public class LibraryBooks {
    protected String bookId;
    protected String bookTitle;
    protected String authorName;
    protected boolean isIssue;

    public LibraryBooks(String bookId,String bookTitle,String authorName){

        this.bookId = bookId;
        this.bookTitle = bookTitle ;
        this.authorName = authorName;
        this.isIssue = false ;


    }

    public String getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean isIssued() {
        return isIssue;
    }

    public void issueBook() {
        isIssue = true;
    }

    public void returnBook() {
        isIssue = false;
    }
    public void displayBookInformation() {

        System.out.println("Book ID      : " + bookId);
        System.out.println("Book Title   : " + bookTitle);
        System.out.println("Author Name  : " + authorName);
    }
}


