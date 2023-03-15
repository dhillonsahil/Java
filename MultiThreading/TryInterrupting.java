package MultiThreading;

public class TryInterrupting {
    public static void main(String[] args) {
        MyThread4 myth4 = new MyThread4();
        Thread th2 = new Thread(myth4);
        th2.start();
        th2.interrupt();
    }
}
class MyThread4 implements Runnable{
    public void run(){
        for(int i=0;i<3;i++){
            try{
                System.out.println("Focus is important");
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println("Thread is interrupted");
            }
        }
    }
}