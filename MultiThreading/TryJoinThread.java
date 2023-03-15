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