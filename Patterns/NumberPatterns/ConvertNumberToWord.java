package Patterns.NumberPatterns;
import java.util.Scanner;

public class ConvertNumberToWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Value to convert to ASCII character");
        int character=scan.nextInt();
        scan.close();
        System.out.println(Character.toString(character));
    }
}
