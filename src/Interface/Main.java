package Interface;

interface I1{
    void fun1();
}
interface I2{
    void fun2();
}
class A implements I1,I2 {

    public void fun1(){}
    public void fun2(){}
    public void fun3(){}
}
public class Main {
    public static void main(){

        // This is ok but we don't create object of interface but we create the reference variable .
//       A obj = newA();
//        obj.fun1();
//        obj.fun2();
//        obj.fun3();


//       I1 obj = new Interface.I1(); // this is wrong here we create object of interface .

        //This is correct  but this variable only use methods of I1 interface .
        I1 obj = new A();
        obj.fun1();


    }
}
