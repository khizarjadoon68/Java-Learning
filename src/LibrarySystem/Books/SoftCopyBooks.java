package LibrarySystem.Books;

public class SoftCopyBooks extends LibraryBooks{
    private double fileSize ;
    private String fileFormat ;

    public SoftCopyBooks(String bookId, String bookTitle, String authorName, double fileSize, String fileFormat){


        super(bookId,bookTitle,authorName);
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
    }

    public double getFileSize() {
        return fileSize;
    }

    public String getFileFormat() {
        return getFileFormat();
    }

    @Override
    public void displayBookInformation() {

        super.displayBookInformation();

        System.out.println("File Size    : "+fileSize+" MB");
        System.out.println("File Format  : "+fileFormat);
        System.out.println("Book Type    : Soft Copy Book");
    }

}
