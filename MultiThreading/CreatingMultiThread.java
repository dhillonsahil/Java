package MultiThreading;

import java.util.Scanner;

public class CreatingMultiThread {
    public static void main(String[] args) {
        MyThread2 mt2 = new MyThread2();
        MyThread2 mt3 = new MyThread2();
        mt2.setName("CALC");
        mt3.setName("dispMessage");
        mt2.start();
        mt3.start();
    }
}

class MyThread2 extends Thread{
    public void run(){
        String tname = Thread.currentThread().getName();
        if(tname.equals("CALC")){
            calc2();
        }else{
            dispMessage();
        }
    }
    public void calc2(){
        System.out.println("Calculation task started");
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number");
        int num2 = sc.nextInt();
        
        int sum = num1+num2;
        System.out.println("Sum "+sum);
        System.out.println("Calculation ended");
        System.out.println("*****************************************");
        sc.close();
    }
    public void dispMessage(){
        System.out.println("*****************************************");
        System.out.println("Displaying info Task started");
        for(int i=0;i<3;i++){
            System.out.println("Focus is the key to master skills.");
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println("Some problem");
            }
        }
        System.out.println("Displaying info Task ended");
        System.out.println("*****************************************");
    }
}