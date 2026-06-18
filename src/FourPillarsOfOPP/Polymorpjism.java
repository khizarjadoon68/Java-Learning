package FourPillarsOfOPP;

class Student {
    public void StudentInfo(int rollNo){
        System.out.println("Student Roll_No "+ rollNo);
    }
    public void StudentInfo(String name){
        System.out.println("Student Name "+name);
    }
    public void StudentInfo(int rollNo ,String name){
        System.out.println("Student Name "+ name + " and Roll_No"+rollNo);
    }

}
public class Polymorpjism {
    public static void main(String[] args){
        Student s1 =new Student();

        s1.StudentInfo(7);
        s1.StudentInfo("khizar");
        s1.StudentInfo(7,"khizar");

    }
    Double abc = Math.sqrt(16.0);
}