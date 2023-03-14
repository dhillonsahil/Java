package MultiThreading;

public class CreateThreadRunnable {
    public static void main(String[] args) {
        MyThread1 myth = new MyThread1();
        Thread c1 = new Thread(myth);
        c1.start();
        
    }
}

class MyThread1 implements Runnable{
    public void run(){
        System.out.println("Child thread");
    }
}