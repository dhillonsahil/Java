package Patterns.NumberPatterns;
import java.util.Scanner;

public class FIbbonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = scan.nextInt();
        scan.close();
        int n1=0;
        int n2=1;
        int n3=1;
        System.out.println("Fibonacci series : ");
        for(int i=0;i<n;i++){
            System.out.print(n1 + " ");
            n3 = n2+n1;
            n1=n2;
            n2=n3;
        }

    }
}
