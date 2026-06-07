package OverloadingAndOverriding;

/* In overriding a child class replaces or changes a method it inherit from the parent class by writing the same
method with own code

 1) Parent and child must have Inheritance .
 2) Method name must be the same .
 */
class Animal {
    //Instance Method
    void sound() {
        System.out.println(".Animal makes a sound");
    }
}
//Class Dog Inherit from Class Animal
class Dog extends Animal {
    //Instance Method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Overriding {
    public static void main(String [] args) {
        //Object
        Dog d1 =new Dog();
        d1.sound();
    }
}