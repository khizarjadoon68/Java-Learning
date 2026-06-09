package ConstructorInheritance;
/*When a child class inherits from a parent class, the parent class constructor is called first,
 then the child class constructor. */

class A{
    //Instance variable
    int a ;

    //Constructor .
    //Passing parameter to Constructor of parent class
    public A (int x){
        a=x ;
        System.out.println("ConstructorInheritance.A");
        System.out.println(a);
    }

}
class B extends A {
    //Constructor .
    public B(){
        /* When we pass an parameter to constructor of parent class then we call manually to parent class with
        super Keyword .*/
        super(6);
        System.out.println("ConstructorInheritance.B");
    }
}
public class Main {
    public static void main(String[] args){
        B obj = new B();

    }
}