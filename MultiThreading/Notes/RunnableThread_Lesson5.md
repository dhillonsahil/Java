# Creating thread with Runnable class
To create a thread with runnable class we create a class that implements the Runnable interface and overwrite the run method of the Runnable class.
> the runnable class has only 1 method called run method that is used to create threads.

After creating a class in the class or method where we want to use the thread(or from where to start the thread). we create a object of the class we craeted (implementing the Runnable) , at this time we can't use it for multi threading because it doesn't has the features like the Thread class.

To get those features we pass the reference of the object of our class to the Thread Constructor while creating the object.

we are kind of saying to thread that i have given the task in the run method of the class , this is the address of the object. you can do it from there.
* we give life to thread by using the start method. 
* we will now use the thread class object reference.

>example

```java
package MultiThreading;

public class CreateThreadRunnable {
    public static void main(String[] args) {
        MyThread1 myth = new MyThread1();
        Thread c1 = new Thread(myth);
        c1.start();
        
    }
}

class MyThread1 implements Runnable{
    public void run(){
        System.out.println("Child thread");
    }
}
```

we are kind of saying to thread that i have given the task in the run method of the class , this is the address of the object. you can do it from there.
we are giving life to thread by using the start method.

> **The Best Approach** :- The benifit of this approach is that if we want to make our class as child(means our class in inheriting another class) so at the same time we can implement the Runnable interface meanwhile when are extending thread we can't extend another class so it can lead to code redundancy(duplicate code).
```java
class Calc extends Demo implements Thread{}
```

## Thread Scheduler
* If multiple threads are waiting to execute , then which will execute 2st is decided by the Thread Scheduler which is part ofJVM.
* In the case of Multithreading we can't predict the exact output , only possible output we can expect.