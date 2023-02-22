package Patterns.NumberPatterns;
import java.util.Scanner;

public class TechNumber{
    public static void main(String[] args) {
        int num,digits=0,a,lasthalf,firsthalf,sumofSquares;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number here : ");
        num=scan.nextInt();
        a=num;
        while(a!=0){
            a/=10;
            digits++;
        }
        if(digits%2==0){
            lasthalf= num%(int)Math.pow(10, digits/2);
            firsthalf= num/(int)Math.pow(10, digits/2);
            sumofSquares = (firsthalf+lasthalf)*(firsthalf+lasthalf) ; 
            if(num==sumofSquares){
                System.out.println("This is a tech number");
            }
            else{
                System.out.println("this is not a tech number");
            }
          
        }
        else{
            System.out.println("not a tech number");
        }
    }
}