package Patterns.NumberPatterns;
import java.util.Scanner;

public class PrimeNumberCheck{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int number = scan.nextInt();
        scan.close();
        boolean isPrime = true;
        for(int i = 2;i<number;i++){
            if(number%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + " is a Prime Number");
        }
        else{
            System.out.println(number + " is not a prime number");
        }
        

    }
}