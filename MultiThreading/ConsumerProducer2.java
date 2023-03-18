package MultiThreading;

public class ConsumerProducer2 {
    public static void main(String[] args) {
        Queue a = new Queue();
        Producer p = new Producer(a);
        Consumer c = new Consumer(a);
        p.start();
        c.start();
    }
}

class Producer extends Thread {
    Queue q;

    Producer(Queue b) {
        q = b;
    }

    public void run() {
        int i = 1;
        while (true) {
            q.put(i++);
        }
    }

}

class Queue {
    int x;
    boolean flag = false;

    synchronized public void put(int a) {
        try {
            if (flag == true) {
                wait();
            } else {
                x = a;
                System.out.println("I have produced the value " + x);
                flag = true;
                notify();
            }
        } catch (Exception e) {
            System.out.println("Some error occured");
        }
    }

    synchronized public void retreive() {
        try {
            if (flag == false) {
                wait();
            } else {
                System.out.println("I have consumed the value " + x);
                flag = false;
                notify();
            }
        } catch (Exception e) {
            System.out.println("Gadbad Hai re baba");
        }
    }
}

class Consumer extends Thread {
    Queue q;

    Consumer(Queue a) {
        q = a;
    }

    public void run() {
        while (true) {
            q.retreive();
        }
    }
}