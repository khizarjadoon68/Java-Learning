package StaticMember;

// A variable that shared between all objects of a class ( instead of each object have its copy ).
public class StaticMember{

    int x; //Instance variable .
    static int y ; // static variable .

    public void fun1 (){} //instance member function .

    //static member only access static variable not instance variable .
    public static void fun2 (){}// static member function .

    //static variable never used in method .
    //But we can have static class .
    static class Test{
        public static String country ="Pakistan";
    } //static class .

    public static void main(String[] args){

//        ClassObject.thisKeyword.Example ex1 = new ClassObject.thisKeyword.Example();
//        ClassObject.thisKeyword.Example ex2 = new ClassObject.thisKeyword.Example();

        // Static variable and function are call with Class name not with objects
        /*Same type of function can call each other . In this example we can call y and fun2 without using the class
         name because they are same type of variable and function .s
         */

        y = 5 ;
        fun2();
        System.out.println(Test.country);
    }
}