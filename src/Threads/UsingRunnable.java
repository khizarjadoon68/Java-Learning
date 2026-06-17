package Threads;

//Creating Thread Using Runnable Interface .
class A implements Runnable {
    //Run() is a predefined method of the Runnable interface.
    //Here we override Run() method .
    public void run(){
        for (int i=0;i<=10;i++){
            System.out.println("Thread Threads.A "+i);
        }
    }
}
class B implements Runnable {
    //Run() is a predefined method of the Runnable interface.
    //Here we override Run() method .
    public void run(){
        for (int i=0;i<=10;i++){
            System.out.println("Thread Threads.B "+i);
        }
    }
}

public class UsingRunnable {
    public static void main(String[] args){
        //creating reference variable of thread and passing object of Class Threads.A and Threads.B .
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());

        t1.start();
        t2.start();

    }
}