package Patterns.NumberPatterns;
import java.util.Scanner;

public class BulbsFluctuation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bulbs=scan.nextInt();
        for(int i=1;i*i<=bulbs;i++){
            System.out.println(i*i);
        }
        scan.close();
    }
}
