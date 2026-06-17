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

        //Both are same things
        //1st way .
        Thread t2 = new Thread(new MYThread());
        //2nd way .
        MYThread obj = new MYThread();
        Thread t1 = new Thread(obj);

        t1.start();
    }
}