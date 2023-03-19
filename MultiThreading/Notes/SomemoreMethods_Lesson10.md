# suspend() and resume()
It puts the Thread from running state to waiting state.
resume() method is used to remove the thread from the waiting stage and resume its process.

They are deprecated methods.
```java
package MultiThreading;
public class TheMainThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " Thread started");
        Thread.currentThread().setName("Artist");
        System.out.println(Thread.currentThread().getName() + " Thread Ended");
        Thread.currentThread().suspend();
        System.out.println("I am the Artist");
    }
}
```

In this example we are Controlling the Main thread , we changed it's name .
```bash
main Thread started
Artist Thread Ended
                        // deadlock here
```
This code results in the deadlock
We can set any thread as deamon(including main)

> Using Suspend and resume on Main Thread
```java
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
            ma.resume();  // if we will not use resume it will cause the deadlock
        } catch (Exception e) {
            // Exception swallowed
        }
        System.out.println("Out test thread");
    }
}
```