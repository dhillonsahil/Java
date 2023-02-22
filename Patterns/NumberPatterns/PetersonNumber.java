package Patterns.NumberPatterns;
import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        int a=number;
        int sumOfFactorial=0;
        scan.close();
        while(a!=0){
            int rem = a%10;
            sumOfFactorial+=factorial(rem);
            a/=10;
        }
        System.out.println(sumOfFactorial);
        if(sumOfFactorial==number){
            System.out.println(number + " is a peterson number");
        }
        else{
            System.out.println(number + " is not a peterson number");
        }
        
    }
   static int factorial(int n){
        if(n>=1){
            return n*factorial(n-1);
        }
        else{
            return 1;
        }
    }
}
