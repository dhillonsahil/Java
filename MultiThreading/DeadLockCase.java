package MultiThreading;

public class DeadLockCase {
    public static void main(String[] args) {
        Car c = new Car();
        Thread th1 = new Thread(c);
        Thread th2 = new Thread(c);
        th1.setName("Student1");
        th2.setName("Student2");
        th1.start();
        th2.start();

    }

}

class Car implements Runnable {
    String res1 = "Java";
    String res2 = "DSA";
    String res3 = "SQL";

    public void run() {
        if (Thread.currentThread().getName().equals("Student1")) {
            try {
                Thread.sleep(3000);
                synchronized (res1) {
                    System.out.println("Student 1 has accquired " + res1);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        /*
                         * this is written inside of previous syncronized because if it is written
                         * outside the resource gets free
                         * but using it inside means student 1 has the resource 1 and he is accquring
                         * the res 2 also.
                         */
                        System.out.println("Student 1 has accquired " + res2);
                        Thread.sleep(3000);
                        synchronized (res3) {
                            System.out.println("Student 1 has accquired " + res3);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Some error");
            }
        }else{
            // if (Thread.currentThread().getName().equals("Student2")) {
                try {
                    Thread.sleep(3000);
                    synchronized (res3) {
                        System.out.println("Student 2 has accquired " + res3);
                        Thread.sleep(3000);
                        synchronized (res2) {
                            /*
                             * this is written inside of previous syncronized because if it is written
                             * outside the resource gets free
                             * but using it inside means student 1 has the resource 1 and he is accquring
                             * the res 2 also.
                             */
                            System.out.println("Student 2 has accquired " + res2);
                            Thread.sleep(3000);
                            synchronized (res1) {
                                System.out.println("Student 2 has accquired " + res1);
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Some error");
                }
        // }
    }

}}