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
    synchronized public void run(){
    // public void run(){
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