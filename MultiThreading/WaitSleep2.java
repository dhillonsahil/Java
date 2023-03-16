package MultiThreading;

public class WaitSleep2 {
    public static void main(String[] args) {
        MyThreadNew mt= new MyThreadNew();
        mt.start();
        synchronized(mt){
            System.out.println("Calling wait");
            try {
                mt.wait();
            } catch (Exception e) {
                
            }
            System.out.println("Main thread got notification");
            System.out.println(mt.total);
        }
    }
}

class MyThreadNew extends Thread{
    int total =0;
    public void run(){
        System.out.println("Starting Calculation");
        synchronized(this){
            for(int i=1;i<=5;i++){
                total+=i;
            }
            this.notify();
            System.out.println("Child class has given  notification");
        }
        System.out.println("Ended Calculation");
    }
}