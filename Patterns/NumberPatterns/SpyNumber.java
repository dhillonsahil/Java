package Patterns.NumberPatterns;
import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        int a=number;
        int sum,product;
        sum=0;
        product=1;
        scan.close();
        while(a!=0){
            int rem=a%10;
            sum+=rem;
            product*=rem;
            a/=10;
        }
        if(sum==product){
            System.out.println(" Spy number");
        }
        else{
            System.out.println("not a spy number");
        }
    }
}
