# synchronization in Java

Before learning it we will learn the problem.

Suppose a person has a and his 3 sons wants to use the car
When we have only one resource and multiple threads execute the resource so the output we will get is illogical. We sometime call it race condition problem because multiple thread are racing for their completion(to utilize cpu time)
```java
package MultiThreading;
public class RaceConditionProblem{
    public static void main(String[] agrs){
        SportsCar c = new SportsCar();
        Thread thr1 = new Thread(c);
        Thread thr2 = new Thread(c);
        Thread thr3 = new Thread(c);
        thr1.setName("SON-1");
        thr2.setName("SON-2");
        thr3.setName("SON-3");
        thr1.start();
        thr2.start();
        thr3.start();
    }
}
class SportsCar implements Runnable{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName() + " has entered the parking lot");
        Thread.sleep(2000);
         System.out.println(Thread.currentThread().getName() + " Got into the Car");
        Thread.sleep(2000);
         System.out.println(Thread.currentThread().getName() + " Started to Drive the car");
        Thread.sleep(2000);
         System.out.println(Thread.currentThread().getName() + "Came back and parked the car");
        }catch(Exception e){
            System.out.println("Some error occurred");
        }
    }
}
```
> Output 
```bash
SON-1 has entered the parking lot
SON-3 has entered the parking lot
SON-2 has entered the parking lot
SON-1 Got into the Car
SON-3 Got into the Car
SON-2 Got into the Car
SON-1 Started to Drive the car
SON-3 Started to Drive the car
SON-2 Started to Drive the car
SON-1Came back and parked the car
SON-3Came back and parked the car
SON-2Came back and parked the car
```
Here all the three are driving a single car at the same time that's the illogical thing how it can be possible. 
To solve that problem we have a concept of synchronization

we have to use the synchronized keyword. this keyword can be used with the method or a block.

after using synchronized keyword with run method The output will be
```bash
SON-1 has entered the parking lot
SON-1 Got into the Car
SON-1 Started to Drive the car
SON-1Came back and parked the car
SON-3 has entered the parking lot
SON-3 Got into the Car
SON-3 Started to Drive the car
SON-3Came back and parked the car
SON-2 has entered the parking lot
SON-2 Got into the Car
SON-2 Started to Drive the car
SON-2Came back and parked the car
```

Now only 1 thread can execute this method now.

> if we want a particular code not to be executed simutaneously but the rest can suppose every one can enter the parking lot at same time but can't use the car at same time so we will write that statements in a block and use synchronized(this) with that block (this) tells to synchronize that block

>example

```java
public class RaceConditionProblem{
    public static void main(String[] agrs){
        SportsCar c = new SportsCar();
        Thread thr1 = new Thread(c);
        Thread thr2 = new Thread(c);
        Thread thr3 = new Thread(c);
        thr1.setName("SON-1");
        thr2.setName("SON-2");
        thr3.setName("SON-3");
        thr1.start();
        thr2.start();
        thr3.start();
    }
}
class SportsCar implements Runnable{
   public void run(){
        try{
            System.out.println(Thread.currentThread().getName() + " has entered the parking lot");
        Thread.sleep(2000);
        synchronized(this) {
            System.out.println(Thread.currentThread().getName() + " Got into the Car");
        Thread.sleep(2000);
         System.out.println(Thread.currentThread().getName() + " Started to Drive the car");
        Thread.sleep(2000);
         System.out.println(Thread.currentThread().getName() + "Came back and parked the car");
        }
        }catch(Exception e){
            System.out.println("Some error occurred");
        }
    }
}
```
>output
```bash
```bash
SON-1 has entered the parking lot
SON-3 has entered the parking lot
SON-2 has entered the parking lot
SON-1 Got into the Car
SON-1 Started to Drive the car
SON-1Came back and parked the car
SON-3 Got into the Car
SON-3 Started to Drive the car
SON-3Came back and parked the car
SON-2 Got into the Car
SON-2 Started to Drive the car
SON-2Came back and parked the car
```
```