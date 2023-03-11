package Patterns.StarAndAlphabetPatterns;
import java.util.Scanner;

public class TrinagularPatternReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scan.nextInt();
        for (int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        scan.close();
    }
}
