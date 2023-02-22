package Strings;
import java.util.Scanner;

public class MaximumOccuringChar {
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
        int maximum=0;
        int ceh=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
                ceh=i;
            }
        }
        // System.out.println(maximum + " "+  (char)(arr[ceh]+97));
        System.out.println("maximum occuring char is : "+((char)(ceh+97)) + " occuring : "+ maximum);
        scan.close();
        
    }
}

