package MultiThreading;
import java.util.Scanner;

public class testAlive{

    public static void main(String[] args) throws Exception {
        System.out.println("Main thread started");
        MyThread33 myth2= new MyThread33();
        Thread th1 = new Thread(myth2);
        th1.start();
        // System.out.println(myth2.checkAlive(th1));;
        th1.join();
        System.out.println("Main thread finished");
        System.out.println(th1.isAlive());;
    }
}
class MyThread33 implements Runnable{
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