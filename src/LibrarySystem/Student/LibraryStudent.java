package LibrarySystem.Student;
import LibrarySystem.Books.LibraryBooks;

public class LibraryStudent {
    protected String studentName;
    protected String registrationNumber;
    protected LibraryBooks assignedBook;

    public LibraryStudent(String studentName ,String registrationNumber){
        this.studentName = studentName;
        this.registrationNumber = registrationNumber;
        this.assignedBook = null;
    }

    public String getStudentName (){
        return studentName;
    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public LibraryBooks getAssignedBook(){
        return assignedBook;
    }
    public void assignBook(LibraryBooks book){
        if (assignedBook != null){
            System.out.println("Student already has a book.");
        }
        if (book.isIssued()) {
            System.out.println("Book is already issued.");
            return;
        }
        assignedBook = book;
        book.issueBook();

        System.out.println("Book assigned successfully.");
    }
    public void returnAssignedBook() {

        if (assignedBook == null) {
            System.out.println("No book assigned.");
            return;
        }

        assignedBook.returnBook();
        assignedBook = null;

        System.out.println("Book returned successfully.");
    }
    public void displayStudentInformation() {

        System.out.println("Student Name : "+studentName);

        System.out.println("Registration Number : "+registrationNumber);

        if (assignedBook != null) {

            System.out.println("Assigned Book : "+assignedBook.getBookTitle());

        } else {

            System.out.println("Assigned Book : None");
        }
    }
}


