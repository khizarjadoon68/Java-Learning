package SuperKeyword;

class A {
    int z ;
    int x ;
    public void f1 (int x){
        System.out.println("this x is from A class " + x);
    }
}
class B extends A {
    int z;
    int x;
    public void f1 (int x){
        System.out.println("this x is from B class " + super.x);

    }
    public void f2(){
        int z ;
        //For Local variable .
        z=5;
       System.out.println("This z is local variable :"+z);

        // for subclass variable .
        this.z=10 ;
        System.out.println("This z is Subclass variable :"+this.z);

        //for superclass variable .
        super.z=15 ;
        System.out.println("This z is Superclass variable :"+super.z);
    }
}

public class superKeyword {
    public static void main(String[] args){
        B obj = new B();
        obj.f1(5 );
        obj.f2();
    }

}