package Inheritance;

public class Main {

    public static void main(String [] args){

        Student s1 =new Student();
        s1.setName("khizar Ali");
        s1.setAge(22);
        s1.setRoll_no(7);

       System.out.println("Student Name :"+s1.getName()); ;
        System.out.println("Student Age :"+s1.getAge());
        System.out.println("Student Roll_no :"+s1.getRoll_no());
    }
}