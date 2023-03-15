# Creating Multiple Threads with The Single Run.
We can achieve multithreading with the help of the Single run method.

To use multi threading with single run the steps will be the following :-
1. Create a class and create the methods for how many types of Threads you want to create example : we want to create two threads for calculations and Display message so we created two methods
2. The class which contains the method need to extend the Thread class.
3. in the main method(or the method who is creating the thread) will create instances of Our class. 
4. for every method or thread we will create a instance.
5. We will set the name of each thread using the thread reference to indentify that which thread can run what method.
Or which method(thread) is using run
6. Now we will use start by the object of our class.
7. In the run() method we will check which instance is calling the thread and we will store the name.
8. Now we will write Conditions to call a method based on which thread is calling the run.

> example

```java
package MultiThreading;

import java.util.Scanner;

public class CreatingMultiThread {
    public static void main(String[] args) {
        MyThread2 mt2 = new MyThread2();
        MyThread2 mt3 = new MyThread2();
        mt2.setName("CALC");
        mt3.setName("dispMessage");
        mt2.start();
        mt3.start();
    }
}

class MyThread2 extends Thread{
    public void run(){
        String tname = Thread.currentThread().getName();
        if(tname.equals("CALC")){
            calc2();
        }else{
            dispMessage();
        }
    }
    public void calc2(){
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
    public void dispMessage(){
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