package LibrarySystem.Student;

public class UnderGraduateStudent extends LibraryStudent {

    private int currentSemester;

    public UnderGraduateStudent(String studentName,String registrationNumber,int currentSemester) {

        super(studentName, registrationNumber);
        this.currentSemester = currentSemester;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    @Override
    public void displayStudentInformation() {

        super.displayStudentInformation();

        System.out.println("Current Semester  : " +currentSemester);

        System.out.println("Student Type      : Undergraduate Student");
    }
}