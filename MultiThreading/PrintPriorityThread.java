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
    }
}
