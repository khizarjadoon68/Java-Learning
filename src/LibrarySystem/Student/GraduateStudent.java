package LibrarySystem.Student;

public class GraduateStudent extends LibraryStudent {
    private String researchArea;

    public GraduateStudent(String studentName,String registrationNumber, String researchArea) {
        super(studentName, registrationNumber);
        this.researchArea = researchArea;
    }

    public String getResearchArea() {
        return researchArea;
    }

    @Override
    public void displayStudentInformation() {

        super.displayStudentInformation();

        System.out.println("Research Area  : " +researchArea);

        System.out.println("Student Type   : Graduate Student");
    }
}