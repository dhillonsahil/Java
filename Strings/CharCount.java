package Strings;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1=scan.nextLine();
        // String str1= "The quick brown fox jumps over lazy dog";
        str1=str1.replace(" ","");
        str1=str1.toUpperCase();
        char ch[]=str1.toCharArray();
        int arr[]= new int[26];

        for(int i=0;i<ch.length;i++){
            arr[ch[i]-65]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){     
            System.out.println("charcter "+Character.toString(97+i) + " has count : "+arr[i]);
            }
        }
        scan.close();
    }
}
