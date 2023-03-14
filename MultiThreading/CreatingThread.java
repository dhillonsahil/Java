package MultiThreading;

public class CreatingThread {
    public static void main(String[] args) {
        System.out.println("Main thread");
        MyThread t = new MyThread();
        t.start();
    }
}
class MyThread extends Thread{
    public void run(){
        System.out.println("Child thread");
        
    }
}

