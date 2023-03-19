package MultiThreading;

public class ConsumerProducer {
    public static void main(String[] args) {
        Queue1 a = new Queue1();
        Producer1 p = new Producer1(a);
        Consumer1 q = new Consumer1(a);
        p.start();
        q.start();
    }
}

class Producer1 extends Thread{
    Queue1 q;
    Producer1(Queue1 b){
        q=b;
    }
    public void run(){
        int i=1;
        while(true){
            q.put(i++);
        }
    }

}
class Queue1{
    int x;
    public void put(int a){
        x=a;
        System.out.println("I have produced the value "+x);
    }
    public void retreive(){
        System.out.println("I have consumed the value "+x);
    }
}

class Consumer1 extends Thread{
    Queue1 q;
    Consumer1(Queue1 a){
        q=a;
    }
    public void run(){
        while(true){
            q.retreive();
        }
    }
}