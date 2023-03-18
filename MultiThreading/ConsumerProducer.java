package MultiThreading;

public class ConsumerProducer {
    public static void main(String[] args) {
        Queue a = new Queue();
        Producer p = new Producer(a);
        Consumer q = new Consumer(a);
        p.start();
        q.start();
    }
}

class Producer extends Thread{
    Queue q;
    Producer(Queue b){
        q=b;
    }
    public void run(){
        int i=1;
        while(true){
            q.put(i++);
        }
    }

}
class Queue{
    int x;
    public void put(int a){
        x=a;
        System.out.println("I have produced the value "+x);
    }
    public void retreive(){
        System.out.println("I have consumed the value "+x);
    }
}

class Consumer extends Thread{
    Queue q;
    Consumer(Queue a){
        q=a;
    }
    public void run(){
        while(true){
            q.retreive();
        }
    }
}