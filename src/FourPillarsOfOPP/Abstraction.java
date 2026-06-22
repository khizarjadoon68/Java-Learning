package FourPillarsOfOPP;

abstract class Car {
     abstract void type ();
     abstract void color ();
     abstract void tyre ();

}
class Mehran extends Car{
    public void type (){
        System.out.println("FourPillarsOfOPP.Car Type is FourPillarsOfOPP.Mehran");
    }
    public void color (){
        System.out.println("FourPillarsOfOPP.Car Color is White");
    }
    public void tyre (){
        System.out.println("4 Tyres FourPillarsOfOPP.Car ");
    }

}

class Honda extends Car{
    public void type (){
        System.out.println("FourPillarsOfOPP.Car Type is FourPillarsOfOPP.Honda");
    }
    public void color (){
        System.out.println("FourPillarsOfOPP.Car Color is White");
    }
    public void tyre (){
        System.out.println("4 Tyres FourPillarsOfOPP.Car ");
    }

}


public class Abstraction {
    public static void main(String[] args){
        Mehran m1 = new Mehran();

        m1.type();
        m1.color();
        m1.tyre();

        Honda c1 = new Honda();

    }
}