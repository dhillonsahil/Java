package MultiThreading;
public class TheMainThread {
    int a;
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " Thread started");
        Thread ma = Thread.currentThread();

        TestThread tr = new TestThread(ma);
        Thread t = new Thread(tr);
        t.start();
         System.out.println("starting suspend");
        Thread.currentThread().suspend();
        System.out.println("ended suspend");
    }
}
class TestThread implements Runnable{
    Thread ma;
    TestThread(Thread ma){
        this.ma=ma;
    }
    public void run(){
        System.out.println("In test thread");
        try {
            Thread.sleep(5000);
            System.out.println("resuming");
            ma.resume();
        } catch (Exception e) {
            // Exception swallowed
        }
        System.out.println("Out test thread");
    }
}