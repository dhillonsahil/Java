package Patterns.NumberPatterns;
import java.util.Scanner;

public class FactorialProgram{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        int result = factorial(number);
        System.out.println("factorial = "+ result);
    }
    public static int factorial(int n){
        if(n>0){
            return n*factorial(n-1);
        }
        else{
            return 1;
        }
    }
}