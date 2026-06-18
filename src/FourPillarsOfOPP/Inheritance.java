package FourPillarsOfOPP;

interface Animal {
    public void Walk();
    public void Eat ();
}

class Dog implements Animal {

    @Override
    public void Walk() {
        System.out.println("Dog can Walk");
    }

    @Override
    public void Eat() {
        System.out.println("Dog can Eat");
    }
}

class Cat implements Animal {
    @Override
    public void Walk() {
        System.out.println("Dog can Walk");
    }

    @Override
    public void Eat() {
        System.out.println("Dog can Eat");
    }
}
public class Inheritance {
    public static void main(String[] args){
        Dog d1 =new Dog();
        d1.Eat();
        d1.Walk();
    }
}
