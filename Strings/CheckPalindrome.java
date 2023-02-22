package Strings;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1=scan.nextLine();
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2+=str1.charAt(i);
        }
        if(str1.equals(str2)){
            System.out.println("palindrome");
        }
        scan.close();
        
    }
}
