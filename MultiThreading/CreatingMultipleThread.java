package MultiThreading;

public class CreatingMultipleThread {
    public static void main(String[] args) {
        MultiThread nt1 = new MultiThread("One");
        MultiThread nt2 = new MultiThread("Two");
        MultiThread nt3 = new MultiThread("Three");
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
    }
}
class MultiThread implements Runnable{
    String name;
    Thread t;
    MultiThread(String ThreadName){
        name=ThreadName;
        t= new Thread(this , name);
        System.out.println("New Thread "+t);
    }
    public void run(){
        for(int i=5;i>0;i--){
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Interrupted");
            }
            System.out.println(name + " exiting");
        }
        
    }
}