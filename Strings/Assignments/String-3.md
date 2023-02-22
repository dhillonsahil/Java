## Question 1. Write a program to remove Duplicates from a string  ?
```java 
import java.util.Arrays;


public class RemoveDuplicate {
    public static void main(String[] args) {
        String str1="this is a string having some duplicate characters";
        str1=str1.replace(" ", "");
        char ch[] = str1.toCharArray();
        Arrays.sort(ch);
        char ch1[]= new char[ch.length];
        int count=0;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]!=ch[i+1]){
                ch1[count]=ch[i];
                count++;
            }
            else if(ch[i]==ch[i]+1){
                continue;
            }
        }
        ch1[count]=ch[ch.length-1];
        for(char n: ch1){
            System.out.print(n);
        }
    }
}
```
___
## Question 2 :- WAP to print Duplicates from a string ?
```java
import java.util.Arrays;

public class PrintDuplicates {
    public static void main(String[] args) {
        String str1 = "keep your notes ready";
        str1 = str1.replace(" ", "");
        char ch[] = str1.toCharArray();
        Arrays.sort(ch);
        char ch1[] = new char[ch.length];
        int count = 0;
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ch[i + 1]) {
                ch1[count] = ch[i];
                count++;
            } else if (ch[i] != ch[i] + 1) {
                continue;
            }
        }
        ch1[count] = ch[ch.length - 1];
        for (char n : ch1) {
            System.out.print(n);
        }
    }
}
```
___
## Question 3 :- WAP to check if “2552” is palindrome or not.
```java
import java.util.Scanner;


public class CheckPalindrome {
    public static void main(String[] args) {
        String str1="2552";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2+=str1.charAt(i);
        }
        if(str1.equals(str2)){
            System.out.println("palindrome");
        }
        
    }
}
```
___
## Question 4 :- WAP to count the number of consonants , vowels and special characters in a string ?
```java
import java.util.Scanner;


public class CountConsonantVowalAndSpecialChar {
    public static void main(String[] args) {
        int consonants=0;
        int vowals=0;
        int specialchar=0;
        String specialchars=" !#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        String consonants_str ="bcdfghjklmnpqrstvwxyz";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str=scan.nextLine();
        scan.close();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'  || str.charAt(i)=='u'){
                vowals++;
            }
            for(int j=0;j<specialchars.length();j++){
                if(str.charAt(i)==specialchars.charAt(j)){
                    specialchar++;
                }
            }
            for(int j=0;j<consonants_str.length();j++){
                if(str.charAt(i)==consonants_str.charAt(j)){
                    consonants++;
                }
            }
        }
        System.out.println("vowals : "+vowals);
        System.out.println("special carcters including space as special character : " +  specialchar);
        System.out.println("consonants : " +  consonants);
    }
}
```
___
## Question 5 :- Wap to implement anagram checking least inbuilt method used.
```java
import java.util.Arrays;

public class CheckAnagramWithoutMethod {
    public static void main(String[] args) {
        String str1 = "the classroom";
        String str2 = "school master";
        String str4 = "";

        // removing white space from str1 using for loop
        String str3 = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                str3 += str1.charAt(i);
            } else {
                continue;
            }
        }
        str1 = str3;

        // removing white space from str2 using for loop
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != ' ') {
                str4 += str2.charAt(i);
            } else {
                continue;
            }
        }
        str2 = str4;

        // converting str1 to array using loop
        char ch1[] = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            ch1[i] = str1.charAt(i);
        }

        // converting str2 to array using loop
        char ch2[] = new char[str2.length()];
        for (int i = 0; i < str2.length(); i++) {
            ch2[i] = str2.charAt(i);
        }

        // sorting ch1
        for (int i = 0; i < ch1.length; i++) {
            for (int j = i + 1; j < ch1.length; j++) {
                if (ch1[i] > ch1[j]) {
                    char temp = ch1[i];
                    ch1[i] = ch1[j];
                    ch1[j] = temp;
                }
            }
        }

        // sorting ch2
        for (int i = 0; i < ch2.length; i++) {
            for (int j = i + 1; j < ch2.length; j++) {
                if (ch2[i] > ch2[j]) {
                    char temp = ch2[i];
                    ch2[i] = ch2[j];
                    ch2[j] = temp;
                }
            }
        }

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("they are Anagram strings");
        } else {
            System.out.println("they are not anagram strings");
        }

    }
}
```
___
## Question 6 :- WAP to implement pangram with least inbuilt method being used .
```java
public class CheckPangramWithoutMehtod {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over lazy dog";

        // removing white space from str1 using for loop
        String str3 = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                str3 += str1.charAt(i);
            } else {
                continue;
            }
        }
        str1 = str3;

        // converting to Array
        char ch1[] = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            ch1[i] = str1.charAt(i);
        }

        // converting to lower case
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] >= 'A' && ch1[i] <= 'Z') {
                ch1[i] = (char) ((int) ch1[i] + 32);
            }
        }

        // cheking all char from a to z are present or not
        int ch2[] = new int[26];
        boolean check = true;
        for (int i = 0; i < ch1.length; i++) {
            ch2[(int) ch1[i] - 97]++;
        }
        for (int n : ch2) {
            if (n == 0) {
                check = false;
            }
        }
        if (check) {
            System.out.println("this String is Pangram");
        } else {
            System.out.println("This String is not pangram");
        }

    }
}
```
___
## Question 7 :- WAP to find if String contains all unique characters .
```java
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
```
___
## Question 8 :- WAP to find maximum occurring character.
```java
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
```