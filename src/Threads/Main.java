package Threads;
//First way to create Thread .
//Creating a thread to extends the Thread class
class MyThread extends Thread {
    //Instance member / Method
    public void run(){
        System.out.println("Thread is Running");
    }
}

public class Main {
    public static void main(String[] args){
        //creating object of Thread Class .
        MyThread t1 = new MyThread();
        t1.start();
    }
}