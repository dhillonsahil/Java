package Patterns.NumberPatterns;
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();
        scan.close();
        int squaredNumber =(int)Math.pow(num, 2);
        System.out.println(squaredNumber);
        String s= Integer.toString(squaredNumber);
        if(s.endsWith(Integer.toString(num))){
            System.out.println("This is automorphic Number");
        }
        else{
            System.out.println("Not a automorphic number");
        }
    }
}
