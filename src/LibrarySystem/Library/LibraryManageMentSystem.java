package LibrarySystem.Library;

import LibrarySystem.Books.LibraryBooks;
import LibrarySystem.Student.LibraryStudent;

public class LibraryManageMentSystem {

    private String libraryName;

    private LibraryBooks[] books;
    private LibraryStudent[] students;

    private int totalBooks;
    private int totalStudents;

    public LibraryManageMentSystem(String libraryName, int bookCapacity, int studentCapacity) {

        this.libraryName = libraryName;

        books = new LibraryBooks[bookCapacity];
        students = new LibraryStudent[studentCapacity];

        totalBooks = 0;
        totalStudents = 0;
    }

    public void addBook(LibraryBooks book) {

        if (totalBooks < books.length) {

            books[totalBooks] = book;
            totalBooks++;

            System.out.println("Book added successfully.");

        } else {

            System.out.println("Library book storage is full.");
        }
    }

    public void addStudent(LibraryStudent student) {

        if (totalStudents < students.length) {

            students[totalStudents] = student;
            totalStudents++;

            System.out.println("Student added successfully.");

        } else {

            System.out.println("Student storage is full.");
        }
    }

    public void displayAllBooks() {

        if (totalBooks == 0) {

            System.out.println("No books available.");
            return;
        }

        System.out.println("\n===== " + libraryName + " Books =====");

        for (int i = 0; i < totalBooks; i++) {

            System.out.println("\nBook Number: " + (i + 1));

            books[i].displayBookInformation();

            System.out.println(
                    "Status : "+ (books[i].isIssued() ? "Issued" : "Available"));
        }
    }

    public void displayAllStudents() {

        if (totalStudents == 0) {

            System.out.println("No students available.");
            return;
        }

        System.out.println("\n===== Students =====");

        for (int i = 0; i < totalStudents; i++) {

            System.out.println("\nStudent Number: "+(i + 1));

            students[i].displayStudentInformation();
        }
    }

    public LibraryBooks getBook(int index) {

        if (index >= 0 && index < totalBooks) {
            return books[index];
        }

        return null;
    }

    public LibraryStudent getStudent(int index) {

        if (index >= 0 && index < totalStudents) {
            return students[index];
        }

        return null;
    }

    public int getTotalBooks() {
        return totalBooks;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void displayAssignedBooks() {

        System.out.println("\n===== Assigned Books Report =====");

        for (int i = 0; i < totalStudents; i++) {

            System.out.print(students[i].getStudentName() +" -> ");

            if (students[i].getAssignedBook() != null) {

                System.out.println(students[i]
                        .getAssignedBook()
                        .getBookTitle());

            } else {

                System.out.println("No Book Assigned");
            }
        }
    }
}