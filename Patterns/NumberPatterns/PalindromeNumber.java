package Patterns.NumberPatterns;
import java.util.Scanner;

// if number == reversed number number is called Palindrome
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        int number_copy=number;
        String reversed_number = "";
        scan.close();
        int i = 0;
        while(i<number){
            reversed_number+=number%10;
            number/=10;
        }
        int n = Integer.valueOf(reversed_number);
        if(n==number_copy){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
