package Threads;

//Creating Thread Using Runnable Interface .
class First implements Runnable {
    //Run() is a predefined method of the Runnable interface.
    //Here we override Run() method .
    public void run(){
        for (int i=0;i<=10;i++){
            System.out.println("Thread First "+i);
        }
    }
}
class Second implements Runnable {
    //Run() is a predefined method of the Runnable interface.
    //Here we override Run() method .
    public void run(){
        for (int i=0;i<=10;i++){
            System.out.println("Thread Second "+i);
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args){
        //creating reference variable of thread and passing object of Class Threads.A and Threads.B .
        Thread t1 = new Thread(new First());
        Thread t2 = new Thread(new Second());

        //Here we set a priority of object .
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }
}