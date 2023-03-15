# Different States of Thread
A thread is a path of execution in a Program that goes through the following states of a thread. The five states are as follows :
1. New (Or born state) :- when object is created it is in born state
2. Runnable :- Whenever we call start that goes in the Runnable state(Also called ready state - ready to be executed).
3. Running : When thread schedular allows the task to run (allocate the task of run and schedules that ki kaam ho jaye )
4. Blocked :- if we use  method like sleep , wait etc when the thread in running or any resource is not available for the thread it goes for waiting (waiting stage) we call it blocked state.
5. Dead :- After the work of the thread is done it goes in Dead state.

> if we use sleep or wait it comes out of blocked/ waiting stage and then again goes to runnable or ready state. then again thread schedular schedules that work.

> A method can came back from running to runnable if it encounters the yield() method. Supose we have multiple threads and the priority of every thread is same so at that time and we want that a thread to come back to runnable and wait so we can use yield method
![Statesofthread](https://github.com/dhillonsahil/Java/blob/main/MultiThreading/Notes/statesOfThread.png "States of thread")

In Java, the yield() method is a static method in the Thread class. It is used to temporarily pause the execution of the current thread and give other threads a chance to run.

When a thread calls the yield() method, it signals to the thread scheduler that it is willing to give up the CPU for a short period of time. The scheduler may then choose to switch to another thread, allowing it to execute.

The yield() method does not guarantee that the thread will give up the CPU, as the scheduler may choose to ignore the request. Additionally, the duration of the pause is not specified and may vary depending on the platform and other factors.

# Some Methods of Threads
1. **Join Method** :- when we use the join() method we are simply saying that the next code will not be executed until the thread comes after finishing the task.

```java
package MultiThreading;

import java.util.Scanner;

public class TryJoinThread{
    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyThread3 myth2= new MyThread3();
        Thread th1 = new Thread(myth2);
        th1.start();
        System.out.println("Main thread finished");
    }
}
class MyThread3 implements Runnable{
    public void run(){
        System.out.println("Child thread started ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2");
        int num2 = sc.nextInt();
        System.out.println("Sum " + (num1+num2));
        sc.close();
        System.out.println("Child thread Finished ");
    }
}
```

> In this following code the output will be like 
```bash
Main thread Started
Main thread finished 
Child thread started
Enter num 1
2 // user input
Enter num 2
3 //user input
Sum 5
```

> The Main thread will get finished before the child thread whether the main thread finished line is at the end.
```java
package MultiThreading;

import java.util.Scanner;

public class TryJoinThread{
    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyThread3 myth2= new MyThread3();
        Thread th1 = new Thread(myth2);
        th1.start();
        try{
            th1.join();
        }catch(Exception e){
            System.out.println("Unable to use join(method)");
        }
        System.out.println("Main thread finished");
    }
}
class MyThread3 implements Runnable{
    public void run(){
        System.out.println("Child thread started ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2");
        int num2 = sc.nextInt();
        System.out.println("Sum " + (num1+num2));
        sc.close();
        System.out.println("Child thread Finished ");
    }
}
```
> Output
```bash
Main thread started
Child thread started 
Enter num 1
2  //user input
Enter num 2
3 // user input
Sum 5
Child thread Finished
Main thread finished
```
> In this Program the Main thread will start and then th1 will start and the main thread will see the join statement so it will wait for the th1 thread to be completed no matter how much cpu cycle is waisted(or we use sleep etc). After th1 will come to dead stage the Main will get executed

2. **isAlive() Method** :- This method let us check is a method alive(means is it registered with the thread Scheduler). before using start will return false.
After a threads run task is finished (we know it goes dead) and if then we check is it alive will print false.

> Check the testAlive() example in codes or below:- 
```java
import java.util.Scanner;

public class testAlive{

    public static void main(String[] args) throws Exception {
        System.out.println("Main thread started");
        MyThread3 myth2= new MyThread3();
        Thread th1 = new Thread(myth2);
        th1.start();
        // System.out.println(myth2.checkAlive(th1));;
        th1.join();
        System.out.println("Main thread finished");
        System.out.println(th1.isAlive());;
    }
}
class MyThread3 implements Runnable{
    public void run(){
        System.out.println("Child thread started ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2");
        int num2 = sc.nextInt();
        System.out.println("Sum " + (num1+num2));
        sc.close();
        System.out.println("Child thread Finished ");
        // System.out.println(Thread.currentThread().isAlive());;
    }
    public boolean checkAlive(Thread t){
        return t.isAlive();
    }
} 
```
3. **Interrput() Method** :- When a thread is in waiting / blocked state we can use the Interrupt method(). we can't use it in running. if a thread fon't go to waiting state(we don't use sleep join etc) so using interrupt method will not effect our Programs

```java
package MultiThreading;

public class TryInterrupting {
    public static void main(String[] args) {
        MyThread4 myth4 = new MyThread4();
        Thread th2 = new Thread(myth4);
        th2.start();
        th2.interrupt();
    }
}
class MyThread4 implements Runnable{
    public void run(){
        for(int i=0;i<3;i++){
            try{
                System.out.println("Focus is important");
            }catch(Exception e){
                System.out.println("Thread is interrupted");
            }
        }
    }
}
```

> No effect of interrupt because thread don't go in wait state

```java
package MultiThreading;

public class TryInterrupting {
    public static void main(String[] args) {
        MyThread4 myth4 = new MyThread4();
        Thread th2 = new Thread(myth4);
        th2.start();
        th2.interrupt();
    }
}
class MyThread4 implements Runnable{
    public void run(){
        for(int i=0;i<3;i++){
            try{
                System.out.println("Focus is important");
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println("Thread is interrupted");
            }
        }
    }
}
```

> it will affect and output will be :- 
```bash
Focus is important
Thread is interrupted
Focus is important
Focus is important
```

> In Java, interrupt() is a method defined in the Thread class that is used to interrupt a thread. When a thread is interrupted, it sets an internal flag that indicates that the thread has been interrupted, and the thread can then choose to either stop executing or continue running.  The interrupt() method can be called on a thread from any other thread to request that it be interrupted. If the target thread is currently blocked in an operation such as sleep() or wait(), it will immediately throw an InterruptedException when it is interrupted. If the target thread is not currently blocked, it will still be interrupted, but it is up to the thread's code to decide how to handle the interruption.

Here are some common use cases for interrupts in Java:

1. Cancelling a task: If a long-running task is taking too much time to complete, you can interrupt the thread that's executing the task to cancel it. This is particularly useful in applications where the user may want to cancel a task that's running in the background.

3. Handling timeouts: Interrupts can be used to handle timeouts in applications. For example, if a thread is waiting for input from a network socket and the input doesn't arrive within a certain time frame, the thread can be interrupted and the application can handle the timeout accordingly.

3. Coordinating threads: Interrupts can be used to coordinate the execution of multiple threads. For example, if one thread is waiting for another thread to complete a task, it can interrupt the other thread to signal that it's ready to proceed.

4. Thread termination: Interrupts can be used to terminate a thread that's running indefinitely. For example, if a thread is stuck in an infinite loop, you can interrupt the thread to stop it from executing.

In summary, interrupts are a powerful tool for managint threads in Java.