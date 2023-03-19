package MultiThreading;

public class CreateThreadRunnable2 {
    public static void main(String[] args) {
        LearnThread lt = new LearnThread();
        Thread tr = new Thread(lt,"Lord Thread");
        tr.start();
    }
}

class LearnThread implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Jai shree Ram");
    }
}