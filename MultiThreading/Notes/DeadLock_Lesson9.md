# DeadLock
In multi threading it as scenario in which multiple threads gets stucked in the Lock state. they don't execute due to the mutual dependency (or cyclic dependency).

> example
suppose we have two threads t1 and t2 and three resources r1,r2 and r3. when we start them the thread schedular will execute any of the thread suppose thread t1. it will use a resource r1 and it will lock that r1 resource ( syncrhonize that) and due to any reason it goes to blocked state. At that time thread schedular will execute the t2 thread and suppose same like t1 it will acquire r3 and lock it and it also goes to thread blocked state. now again t1 will come and acquire r2 and goes to blocked state for any reason. Now when t2 will come it also need r2 but that is acquired(synchronzied) by the t1 , so t2 can't use that and it go to blocked state again. now t1 will come , it needs r3 but that is synchronized by t2. So now both of the thread are in blocked state permanently because of unavailability of the resource(cyclic dependency or mutual dependency). This is called dead lock.

> after waiting stage threads come in runnable not directly to running state

```java
public class DeadLockCase {
    public static void main(String[] args) {
        Car c = new Car();
        Thread th1 = new Thread(c);
        Thread th2 = new Thread(c);
        th1.setName("Student1");
        th2.setName("Student2");
        th1.start();
        th2.start();

    }

}

class Car implements Runnable {
    String res1 = "Java";
    String res2 = "DSA";
    String res3 = "SQL";

    public void run() {
        if (Thread.currentThread().getName().equals("Student1")) {
            try {
                Thread.sleep(3000);
                synchronized (res1) {
                    System.out.println("Student 1 has accquired " + res1);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        /*
                         * this is written inside of previous syncronized because if it is written
                         * outside the resource gets free
                         * but using it inside means student 1 has the resource 1 and he is accquring
                         * the res 2 also.
                         */
                        System.out.println("Student 1 has accquired " + res2);
                        Thread.sleep(3000);
                        synchronized (res3) {
                            System.out.println("Student 1 has accquired " + res3);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Some error");
            }
        }else{
            
                try {
                    Thread.sleep(3000);
                    synchronized (res3) {
                        System.out.println("Student 2 has accquired " + res3);
                        Thread.sleep(3000);
                        synchronized (res2) {
                            /*
                             * this is written inside of previous syncronized because if it is written
                             * outside the resource gets free
                             * but using it inside means student 1 has the resource 1 and he is accquring
                             * the res 2 also.
                             */
                            System.out.println("Student 2 has accquired " + res2);
                            Thread.sleep(3000);
                            synchronized (res1) {
                                System.out.println("Student 2 has accquired " + res1);
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Some error");
                }
        // 
    }

}}
```

> output 
```bash
Student 1 has accquired Java
Student 2 has accquired SQL
Student 1 has accquired DSA
|  // here the deadlock will happen and the program will not terminate and stuck permanently because the resources are locked(cyclic dependency)
```

> as a programmer we need to take care of the Deadlock (avoid it)