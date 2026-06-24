package LibrarySystem;

import LibrarySystem.Books.HardCopyBooks;
import LibrarySystem.Books.LibraryBooks;
import LibrarySystem.Books.SoftCopyBooks;
import LibrarySystem.Library.LibraryManageMentSystem;
import LibrarySystem.Student.GraduateStudent;
import LibrarySystem.Student.LibraryStudent;
import LibrarySystem.Student.UnderGraduateStudent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LibraryManageMentSystem library = new LibraryManageMentSystem(" Library", 100, 100);

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println(" LIBRARY MANAGEMENT SYSTEM ");
            System.out.println("=================================");
            System.out.println("1. Add Hard Copy Book");
            System.out.println("2. Add Soft Copy Book");
            System.out.println("3. Add Graduate Student");
            System.out.println("4. Add Undergraduate Student");
            System.out.println("5. Show All Books");
            System.out.println("6. Show All Students");
            System.out.println("7. Assign Book To Student");
            System.out.println("8. Return Book");
            System.out.println("9. Show Assigned Books");
            System.out.println("10. Exit");

            System.out.print("\nEnter Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    String hardBookId = input.nextLine();

                    System.out.print("Enter Book Title: ");
                    String hardBookTitle = input.nextLine();

                    System.out.print("Enter Author Name: ");
                    String hardBookAuthor = input.nextLine();

                    System.out.print("Enter Total Pages: ");
                    int totalPages = input.nextInt();

                    LibraryBooks hardBook = new HardCopyBooks(hardBookId,hardBookTitle,hardBookAuthor,totalPages);

                    library.addBook(hardBook);

                    break;

                case 2:

                    System.out.print("Enter Book ID: ");
                    String softBookId = input.nextLine();

                    System.out.print("Enter Book Title: ");
                    String softBookTitle = input.nextLine();

                    System.out.print("Enter Author Name: ");
                    String softBookAuthor = input.nextLine();

                    System.out.print("Enter File Size (MB): ");
                    double fileSize = input.nextDouble();
                    input.nextLine();

                    System.out.print("Enter File Format: ");
                    String fileFormat = input.nextLine();

                    LibraryBooks softBook = new SoftCopyBooks(softBookId, softBookTitle, softBookAuthor,fileSize,
                                    fileFormat);

                    library.addBook(softBook);

                    break;

                case 3:

                    System.out.print("Enter Student Name: ");
                    String graduateName = input.nextLine();

                    System.out.print("Enter Registration Number: ");
                    String graduateRegNo = input.nextLine();

                    System.out.print("Enter Research Area: ");
                    String researchArea = input.nextLine();

                    LibraryStudent graduateStudent = new GraduateStudent(graduateName,graduateRegNo,researchArea);

                    library.addStudent(graduateStudent);

                    break;

                case 4:

                    System.out.print("Enter Student Name: ");
                    String undergraduateName = input.nextLine();

                    System.out.print("Enter Registration Number: ");
                    String undergraduateRegNo = input.nextLine();

                    System.out.print("Enter Current Semester: ");
                    int semester = input.nextInt();

                    LibraryStudent undergraduateStudent = new UnderGraduateStudent(undergraduateName,undergraduateRegNo,
                                    semester);

                    library.addStudent(undergraduateStudent);

                    break;

                case 5:

                    library.displayAllBooks();

                    break;

                case 6:

                    library.displayAllStudents();

                    break;

                case 7:

                    if (library.getTotalStudents() == 0 || library.getTotalBooks() == 0) {

                        System.out.println(
                                "Add students and books first.");
                        break;
                    }

                    System.out.println("\nStudents:");

                    for (int i = 0;i < library.getTotalStudents();i++) {

                        System.out.println((i + 1) + ". " + library.getStudent(i).getStudentName());
                    }

                    System.out.print(
                            "Select Student Number: ");

                    int studentChoice = input.nextInt();

                    System.out.println("\nBooks:");

                    for (int i = 0; i < library.getTotalBooks(); i++) {

                        System.out.println((i + 1) + ". "+ library.getBook(i).getBookTitle());
                    }

                    System.out.print(
                            "Select Book Number: ");

                    int bookChoice =
                            input.nextInt();

                    LibraryStudent selectedStudent =
                            library.getStudent(
                                    studentChoice - 1);

                    LibraryBooks selectedBook = library.getBook(bookChoice - 1);

                    if (selectedStudent != null && selectedBook != null) {

                        selectedStudent.assignBook(selectedBook);
                    }

                    break;

                case 8:

                    if (library.getTotalStudents() == 0) {

                        System.out.println("No students available.");
                        break;
                    }

                    System.out.println("\nStudents:");

                    for (int i = 0; i < library.getTotalStudents();i++) {

                        System.out.println((i + 1) + ". " + library.getStudent(i).getStudentName());
                    }

                    System.out.print("Select Student Number: ");

                    int returnStudent = input.nextInt();

                    LibraryStudent student = library.getStudent(returnStudent - 1);

                    if (student != null) {
                        student.returnAssignedBook();
                    }

                    break;

                case 9:

                    library.displayAssignedBooks();

                    break;

                case 10:

                    System.out.println(
                            "\nThank You For Using Library System");

                    break;

                default:

                    System.out.println(
                            "Invalid Choice!");
            }

        } while (choice != 10);

        input.close();
    }
}