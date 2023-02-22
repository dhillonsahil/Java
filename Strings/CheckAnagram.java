package Strings;
import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1="school master";
        String str2 = "The Classroom";
        str1= str1.replace(" ", "");
        str2= str2.replace(" ", "");
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char str3[] =str1.toCharArray();
        char str4[] =str2.toCharArray();
        Arrays.sort(str3);
        Arrays.sort(str4);
        if(Arrays.equals(str3, str4)){
            System.out.println("the strings are anagram");
        }
        else{
            System.out.println("not anagram");
        }
       
        // System.out.println(str1);
    }
}
