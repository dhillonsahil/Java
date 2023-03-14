# Main Thread
The default thread create by jvm is main
To access some features of Thread we can use Thread class like other classes 

> example :- to get the name of the current thread we can use the following code

```java
package MultiThreading;
public class PrintThreadName{
    public static void main(String[] args){
        System.out.print("The current thread is ");
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
```

* Every thread has a priority , which is value that determines the relative importance of the thread. Threat priority is used by jvm to decide which thread should be scheduled to run first when multiple threads are waiting to execute.

* It is represented by a value between 1 and 10 where 1 is lowest and 10 is highest. 
* You can set the priority of a thread using the setPriority() method provided by the Thread class. and get by getPriority by getPriority(). we can also set Name using setName().
```java 
Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
```

> example 2
```java
package MultiThreading;

public class PrintPriorityThread {
    public static void main(String[] args) {
        System.out.print("The current thread ");
        System.out.println(Thread.currentThread().getName());
        System.out.print("priority is ");
        System.out.println(Thread.currentThread().getPriority());
        
        Thread.currentThread().setPriority(10);
        System.out.println("After changing priority is : ");
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setName("SAHIL");
    }
}

```