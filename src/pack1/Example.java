//The Student class created in pack1 .
//Import the Student class of pack2 .
package pack1;
import pack2.Student ;

public class Example {
    public static void main(String[] args){

        Student s1 = new Student();
        s1.setName("khizar Ali");
        s1.setRollNo(7);

        System.out.println("Name :"+s1.getName());
        System.out.println("RollNo"+ s1.getRollNo());

    }
}