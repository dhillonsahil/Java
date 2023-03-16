// this code results into deadlock

package MultiThreading;

public class WaitSleep {
    public static void main(String[] args) {
        Object lock = new Object();
        boolean flag = false;
        MyThread7 mtr = new MyThread7(lock,  flag);
        MyThread8 mtr2 = new MyThread8(lock , flag);
        Thread th = new Thread(mtr);
        Thread th1 = new Thread(mtr2);
        th.setPriority(10);
        th1.setPriority(1);
        th.start();
        th1.start();
    }
}


class MyThread7 implements Runnable{
    private final Object lock;
    private boolean flag;
    public MyThread7(Object lock , boolean flag){
        this.lock=lock;
        this.flag= flag;
    }
    public void run(){
        System.out.println("Line 1");
        try{
            // Thread.sleep(2000);
           synchronized(lock){
            while(!flag){
                lock.wait();
            }
           }
        }catch(InterruptedException e){
            System.out.println("Some error occured");
        }
        System.out.println("Line 2");
    }
    
}


class MyThread8 implements Runnable{
    private final Object lock;
    boolean flag;
    public MyThread8(Object lock, boolean flag){
        this.lock=lock;
        this.flag=flag;
    }
    public void run(){
        System.out.println("Thread to notify");
        synchronized(lock){
            this.flag=true;
            lock.notify();
        }
        System.out.println("notified");
        try {
            // sleep for a small amount of time to release the lock
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Some error occurred");
        }
    }
}