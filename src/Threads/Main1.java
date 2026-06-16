package Threads;

//Second way to create Thread .
// Implementing Runnable Interface to create Thread .
class MYThread implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main1 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread());
        t1.start();
    }
}