package ConstructorInheritance;
/*When a child class inherits from a parent class, the parent class constructor is called first,
 then the child class constructor. */

class A{
    int a ;
   //Constructor .
    public A (int x){
        a=x ;
        System.out.println("ConstructorInheritance.A");
        System.out.println(a);
    }

}
class B extends A {
    //Constructor .
    public B(){
        // manually call super class
        super(6);
        System.out.println("ConstructorInheritance.B");
    }
}
public class Main {
    public static void main(String[] args){
        B obj = new B();

    }
}