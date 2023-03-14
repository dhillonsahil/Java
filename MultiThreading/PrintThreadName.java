package MultiThreading;
public class PrintThreadName{
    public static void main(String[] args){
        System.out.print("The current thread is ");
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}