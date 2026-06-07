package InitializationBlock;

public class Test {
    // Instance Member Variable Or properties .
    private  int x ;

    // Instance Initialization Block .
    //It automatically run's when the object of this class created .
    {
        System.out.println("Initialization Block: x ="+x);
        x=5 ;
    }
    // Constructor .
     public Test (){
        System.out.println("Constructor: x="+x);
     }

     public static void main(String[] args){
//Object Created .
        Test t1 = new Test();
        Test t2 = new Test();


     }
}