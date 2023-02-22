package Strings;
import java.util.Arrays;
import java.util.Scanner;

public class CheckUniqueChars{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str1=scan.nextLine();
        // String str1 = "sahil";
        str1=str1.toLowerCase();
        str1=str1.replace(" ","");
        char ch[]=str1.toCharArray();
        Arrays.sort(ch);
        boolean Unique = true;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]){
                Unique=false;
            }
        }
        if(Unique){
            System.out.println("this string has all unique characters");
        }
        else{
            System.out.println("this string has some duplicates characters");
        }
        scan.close();
    }
}