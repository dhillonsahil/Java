# Question 1 : What do mean by MultiThreading ? why is it important ?
**Answer** :- Multithreading is a Feature of Java in which we can run more than one thread concurrrently.
 A thread is a independent task in a Program. A thread is
considered Light weighted because the threads are in the same program.

Multi threading is used in Programming so we can save the cpu cycles by performing multiple threads. It is commonly used in Web servers,games etc.
It a efficient way to do any work

# Question 2 : What are main benifits of Using Multithreading ?
**Answer** :- 
* Saving Computer Time.
* Better utilization of the resources(Like memory,ram).
* If any exception(run time error)comes it will not affect the other threads.
* it allows a user to run the parts of the program(threads) to run continuaslly even if a thread is blocked due to some reasons.
* A user can to multiple task at the same time.
* The performance of the cpu is Better if we Multithreading.

# Question 3 : What is a thread in java ?
**Answer** :- A thread is a single part of any Process(or application) which is independent of the other tasks. this task can execute no matter any other thread is done executing or not. It is the lighest and smallest part of any Program.
They are used to use the multiple cpu at a time. So that program will be efficent and an complex program can be made easy by breaking it into smaller parts.

# 4 : What are the two ways of implementing Thread in java ?
**Answer** :- MultiThreading in Java (Thread in java) can be implemented by two ways

1. **By extending the Thread Class** :- We create a Class that extends the Thread Class so we can use all the features of the Thread class. We have to define the task in the run method in our class. 

   example :- 
   ```java
   public class Type1{
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
    } 
    class MyThread extends Thread{
        public void run(){
            System.out.print("This is a new thread");
        }
    }
   ```

2. **By implementing the Runnable Interface** :-  In this method we create a class that extends the Runnable interface and we will overwrite the run method in the class. And in the other method which is executing the threads(like main) we will create a object of the class we made and Thread class.While creating the thread class we will pass the reference of the object we created of our class(the one implementing the Runnable). Now we can use our thread by the reference of The Thread class.

    example:- 
    ```java
    public class Type2{
    public static void main(String[] args) {
        MyThread mt = new MyThread();
       Thread t = new Thread(mt);
       t.start();
    }
    }
    class MyThread implements Runnable{
        public void run(){
            System.out.print("This is a new thread");
        }
    }
    ```

# Question 5 : What is the difference between thread and Process.
**Answer** :-

1. **Process** :-  A Process is a complete application which consists of a number of threads. It is considered as heavy weighted.  It is independent of another Process(application).

    example :- Chrome, Apple store etc.

2. **Thread** :- A thread is considered as light weighted. it is a part of the Program. It can be independent of another thread. 

    example :- In whatsapp we have different threads like chat feature , story feature , Call feature etc.

# Question 6 : How can we Create Daemon threads ?
**Answer** : Deamon threads are the threads which runs in the background. if we want to make any thread as daemon thread we will use the setDeamon(true) method with that thread. there is a method also available which helps us to check whether the current thread is deamon or not.

we can only make a deamon thread until the start() method is used.

Example :- 
```java
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
```

# Question 7 : What are wait() and sleep() methods.
**Answer** :-

**sleep()** :- sleep() methods is used in multithreading so we can stop execution of a thread if we use the sleep method we can give the times in milliseconds in it so that it will pause its work for that much time and other threads can use that time . when that time is over it will comebback to that thread.

```java
package MultiThreading;

public class WaitSleep {
    public static void main(String[] args) {
        MyThread7 mtr = new MyThread7();
        Thread th = new Thread(mtr);
        th.start();
    }
}

class MyThread7 implements Runnable{
    public void run(){
        System.out.println("Line 1");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Some error occured");
        }
        System.out.println("Line 2");
    }
}
```
> output
```bash
Line 1
Line 2
```
**wait() method** :- wait() method in used in Multithreading so we can pause the execution of a thread. until another thread tells it to resume that task. another thread tell to resume with the the help of notify() and notifyAll() methods.notify thread notifies only 1 thread to start running a thread but notifyAll() notifies all the threads
```java
package MultiThreading;

public class WaitSleep2 {
    public static void main(String[] args) {
        MyThreadNew mt= new MyThreadNew();
        mt.start();
        synchronized(mt){
            System.out.println("Calling wait");
            try {
                mt.wait();
            } catch (Exception e) {
                
            }
            System.out.println("Main thread got notification");
            System.out.println(mt.total);
        }
    }
}

class MyThreadNew extends Thread{
    int total =0;
    public void run(){
        System.out.println("Starting Calculation");
        synchronized(this){
            for(int i=1;i<=5;i++){
                total+=i;
            }
            this.notify();
            System.out.println("Child class has given  notification");
        }
        System.out.println("Ended Calculation");
    }
}
```