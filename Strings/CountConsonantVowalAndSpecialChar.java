package Strings;
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
