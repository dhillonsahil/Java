package Patterns.NumberPatterns;
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        double numToCheck = scan.nextInt();
        scan.close();
        int sum=0;
        double SquareofNumber=Math.pow(numToCheck, 2);
        int n = (int)SquareofNumber;
       for(int i=0;n!=0;i++){
        int rem = n%10;
        sum+=rem;
        n/=10;
       }
       if(numToCheck==sum){
        System.out.println("This is neon number");
       }
       else{
        System.out.println("THis is Not a neon number");
       }
       scan.close();
    }
}
