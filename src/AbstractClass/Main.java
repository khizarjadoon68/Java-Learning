package AbstractClass;

//We can not create an object of abstract class .
// It declare with abstract keyword .
//We use abstract class for inheritance .

abstract class Person{
    //instance member variable
    private String name ;
    private int age ;

    //instance member methods .
    public void setName(String n) {
        name = n;
    }
    public void setAge(int a) {
        age = a;
    }
}
public class Main {
    public static void main(String[] args){
        //This is an error
        //Person p1 = new AbstractClass.Person();
    }
}