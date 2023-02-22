package Patterns.NumberPatterns;
import java.util.Scanner;

public class CubeRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value to find cube root");
        int number=scan.nextInt();
        scan.close();
        System.out.println(Math.cbrt(number));
    }
}
