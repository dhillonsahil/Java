package Patterns.NumberPatterns;
import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter a number");
        int number=scan.nextInt();
        scan.close();
        int nextNumber = number+1;
        int SquareRoot = (int)Math.sqrt(nextNumber);
        if(Math.pow(SquareRoot, 2)==nextNumber){
            System.out.println("The number is Sunny Number");
        }
        else{
            System.out.println("Number is not sunny Number");
        }
    }
}
