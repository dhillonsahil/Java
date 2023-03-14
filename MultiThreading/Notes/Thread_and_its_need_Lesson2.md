# Line of execution
In Java, the term "line of execution" (flow of execution) typically refers to the sequence of statements that are executed in a program as it runs. When a Java program is executed, the JVM (Java Virtual Machine) reads the bytecode instructions in the .class file and executes them in a specific order.

The execution starts with the first statement in the main() method and proceeds line by line, executing each statement in turn until the end of the method is reached. If there are other methods called from the main() method, the execution moves to those methods and executes their statements, and then returns to the main() method.

It's important to note that the order of execution can be influenced by control flow statements such as if-else, loops, and switch statements. These statements can alter the normal sequence of execution by branching to a different section of code or repeating a section of code multiple times.

Additionally, in multi-threaded programs, multiple lines of execution can occur simultaneously, as different threads execute different sections of the code in parallel.

Overall, the line of execution in a Java program refers to the sequence of statements that are executed as the program runs, and can be influenced by control flow statements and multi-threading.

___
java line of execution is technically called a thread. wherever this thread goes code gets executed.

Suppose we want to receive any input from user but user is not entering so the thread will not move further. but we have some other independent tasks and there is only one thread so they can't be executed 

> consider the following example
```java
package MultiThreading;

import java.util.Scanner;

public class SingleDefaultThread{
    public static void main(String[] args) {
        // task 1
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
        
        // task 2 :- which is independent of task 1
       System.out.println("Printing * Task started");
        for(int i=0;i<4;i++){
            System.out.println("*");
        }
        System.out.println("Printing * Task ended");
        System.out.println("*****************************************");

        // task 3 independent of both task 1 and task 2 an
        System.out.println("Displaying info Task started");
        for(int i=0;i<3;i++){
            System.out.println("Focus is the key to master skills.");
        }
        System.out.println("Displaying info Task ended");
        System.out.println("*****************************************");

        // task 2 and task 3 will not get executed until task 1 (if we don't enter input in num1 and num2) is finished because we don't created any thread a single thread is their to execute program and that
        // thred is also created by jvm
        sc.close();
    }
}
```
In this program the time of cpu is wasted if input not entered , there are 2 process waiting to move to execution stage but there is only 1 thread (called main thread).

> There is only 1 solution of this now and that is multithreading

