# How to Create Threads
There are two ways to create a thread :
1. By extending Thread class
2. By implementing Runnable interface

> There is an interface in java as Runnable and it has a method as void run();

Thread has many methods like start() , join(), wait() , sleep() and run will also be inherited when we are extending thread class because Thread class implements the Runnable interface.

If there is any task and we want to create a thread that runs our code(performs our task) so we have to write that in the run method in our class(overwrite run) and that class must extend Thread class
```java
package MultiThreading;

public class CreatingThread {
    public static void main(String[] args) {
        System.out.println("Main thread")
        MyThread t = new MyThread();
        t.start();

    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("Child thread");
    }
}
```

here we created a object of our MyThread we have not defined start method and no error is coming while we call the start method. we have to write our task in run method but we can't call run methods
> if we will invoke(call) the run method the program will behave like Single threaded Program. so we have to use start method

By using start method we register(telling thread schedular that we created a thread) our thread with the  thread Scheduler (Boss of threads). 
run is called inside of the start.


when we tried to call main ,stack frame of main will come in stack. and a thread is created main thread (by default).
Then in the first line we printed "Main Thread"
Then we created a object of MyThread so in heap a object will be created with reference t.

> In start there is many lines of code when we use t.start() it registers the thread with thread Scheduler and then run is called in those lines of codes.

Jvm has a thread Schedular which is boss of all threads no matter the thread is created automatically or we created that.
> **The thread scheduler** is a part of the operating system or the Java Virtual Machine (JVM) that is responsible for deciding which thread should run at a given time. The thread scheduler manages the execution of multiple threads, ensuring that each thread gets a fair share of the CPU time and that the threads are executed in the order specified by their priority. 

> In Java, the thread scheduler is a part of the JVM and is responsible for scheduling the execution of all threads created by the JVM. When multiple threads are waiting to execute, the thread scheduler decides which thread should run next based on its priority and the scheduling algorithm used by the JVM.

> The JVM uses a preemptive scheduling algorithm to manage the execution of threads, which means that the thread scheduler can interrupt a running thread and switch to another thread at any time. This helps ensure that all threads get a fair share of the CPU time and that the system remains responsive even when multiple threads are running.

My thread object is equivalent to creating a Thread class (because it implements a thread class).

# Creating Multiple Threads.

```java
package MultiThreading;

import java.util.Scanner;

public class MultipleThreads {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Calc t1 = new Calc();
        Message t2 = new Message();
        t1.start();
        t2.start();
        
    }
}

class Calc extends Thread{
    public void run(){
        System.out.println("Calculation task started");
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number");
        int num2 = sc.nextInt();
        
        int sum = num1+num2;
        System.out.println("Sum "+sum);
        System.out.println("Calculation ended");
        System.out.println("*****************************************");
        sc.close();
    }
}
class Message extends Thread{
    public void run(){
        System.out.println("*****************************************");
        System.out.println("Displaying info Task started");
        for(int i=0;i<3;i++){
            System.out.println("Focus is the key to master skills.");
        }
        System.out.println("Displaying info Task ended");
        System.out.println("*****************************************");
    }
}
```

when we used t1.start() thread schedular got the t1 thread. then in main next line is t2.start()  and now thread schedular has t2 thread also. so it have three threads main , t1 ad t2. 
in t2 there is some delay because we accept the input so it will run the code of t1 before the line which accepts input(jo line input leti hai us se pehle wali sari lines execute ho jayegi). now to avoid delay(thread scheduler makes sure not to waste cpu cycle) to other threads. it takes the control from t1 and executes t2(if any delay comes in t2 also then t1 is started from where it paused and so on). after executing t2 the control is again given to the t1.

> so the output will look like
```bash
Main Thread started
Calculation task started
*****************************************
Displaying info Task started
Focus is the key to master skills.
Focus is the key to master skills.
Focus is the key to master skills.
Displaying info Task ended
*****************************************
Please enter first number

2 // entered by user
Please enter second number
3 // entered by user
Sum 5
Calculation ended
*****************************************
```

___
if we use Thread.sleep(milliseconds) we need to use try catch because it is checked exception.
```java
package MultiThreading;

import java.util.Scanner;

public class MultipleThreads {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Calc t1 = new Calc();
        Message t2 = new Message();
        t1.start();
        t2.start();
        
    }
}

class Calc extends Thread{
    public void run(){
        System.out.println("Calculation task started");
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number");
        int num2 = sc.nextInt();
        
        int sum = num1+num2;
        System.out.println("Sum "+sum);
        System.out.println("Calculation ended");
        System.out.println("*****************************************");
        sc.close();
    }
}
class Message extends Thread{
    public void run(){
        System.out.println("*****************************************");
        System.out.println("Displaying info Task started");
        for(int i=0;i<3;i++){
            System.out.println("Focus is the key to master skills.");
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println("Some problem");
            }
        }
        System.out.println("Displaying info Task ended");
        System.out.println("*****************************************");
    }
}
```
In this example same like below some code of t1 will get executed because of some delay thread Scheduler started t2 .In t2 we used sleep() so after printing Focus is important to master skills it will go to t1 and do the stuff when 2 seconds will get completed it will came back to t1 leaving the t1's tasking in pending for some time when again sleep comes it will resume the task of t1 and so on.

> Light weighted(because multitasking is within the Same Application)

we are just registering our thread with thread schedular. Thread schedular decides that which thread will get the chance we can't control that.

> we can use composition to create a Thread inside of The out Custom thread which implements Runnable.
```java
package MultiThreading;

public class CreatingMultipleThread {
    public static void main(String[] args) {
        MultiThread nt1 = new MultiThread("One");
        MultiThread nt2 = new MultiThread("Two");
        MultiThread nt3 = new MultiThread("Three");
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
    }
}
class MultiThread implements Runnable{
    String name;
    Thread t;
    MultiThread(String ThreadName){
        name=ThreadName;
        t= new Thread(this , name);
        System.out.println("New Thread "+t);
    }
    public void run(){
        for(int i=5;i>0;i--){
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Interrupted");
            }
            System.out.println(name + " exiting");
        }
    }
}
```