package MultiThreading;
public class CreateDeamon{
    public static void main(String[] args) {
        MyThread6 mt = new MyThread6();
        Thread thr = new Thread(mt);
        thr.start();
        System.out.println(thr.isDaemon());
        thr.setDaemon(true);
        System.out.println(thr.isDaemon());
    }
}
class MyThread6 implements Runnable{
    public void run(){
        System.out.println("This is child thead.");
    }
}