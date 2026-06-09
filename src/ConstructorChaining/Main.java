package ConstructorChaining;

//Constructor Chaining is the process of calling one constructor from another constructor.
class A{
    //constructor of A .
    public A(){
        System.out.println(".A 1");
    }
}
class B extends A {
    //constructor of ConstructorChaining.B .
    public B(){
        this(4); //this represent same class Constructor
        System.out.println("B 1");
    }
    //constructor of B .
    //when we create multiple constructors in one class always parameters are different .
    public B(int x){

        System.out.println("B 2");

    }
}
public class Main {
    public static void main(String[] args){
        B obj = new B();
    }
}