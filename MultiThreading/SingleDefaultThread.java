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