package OverloadingAndOverriding;
//Having multiple method with same name but different in parameters .

class A {
    //Method
    public void f1(int a) {
        System.out.println("Class A Input value is :"+a);
    }
}
// FourPillarsOfOPP.Inheritance
class B extends A {
    //Method
    public void f1(int a, int b) {
        System.out.println("Class B Input values are: " + a + " " + b);    }
}

public class Overloading {

    public static void main(String[] args) {
        //Create an Object of B class
        B obj = new B();
        //Call f1 methods with different parameters .
        obj.f1(5);
        // call Class B
        obj.f1(10, 15);
    }
}