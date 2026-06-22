package LibrarySystem.Books;

public class HardCopyBooks extends LibraryBooks {
    private int totalPages ;
    public HardCopyBooks(String bookId,String bookTitle,String authorName ,int totalPages ){
            super(bookId,bookTitle,authorName);
            this.totalPages = totalPages ;
    }
    public int getTotalPages(){
        return totalPages ;
    }

    @Override

    public void displayBookInformation (){
        super.displayBookInformation();

        System.out.println("Total Pages  :"+totalPages);
        System.out.println("Book Type  : Hard Copy Book");
        }

    }
