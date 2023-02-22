package Strings;
import java.util.Arrays;


public class CheckAnagramWithoutMethod{
    public static void main(String[] args) {
        String str1 = "the classroom";
        String str2 = "school master";
        String str4= "";
        
        // removing white space from str1 using for loop
        String str3 ="";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=' '){
                str3+=str1.charAt(i);
            }
            else{
                continue;
            }
        }
        str1 = str3;
        
        // removing white space from str2 using for loop
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i)!=' '){
                str4+=str2.charAt(i);
            }
            else{
                continue;
            }
        }
        str2 = str4;
        
        // converting str1 to array using loop
        char ch1[]=new char[str1.length()];
        for(int i=0;i<str1.length();i++){
            ch1[i]=str1.charAt(i);
        }

        // converting str2 to array using loop
        char ch2[]=new char[str2.length()];
        for(int i=0;i<str2.length();i++){
            ch2[i]=str2.charAt(i);

            
        }

       // sorting ch1
       for(int i=0;i<ch1.length;i++){
        for(int j=i+1;j<ch1.length;j++){
            if(ch1[i]>ch1[j]){
                char temp = ch1[i];
                ch1[i]=ch1[j];
                ch1[j]=temp;
            }
        }
       }

       // sorting ch2
       for(int i=0;i<ch2.length;i++){
        for(int j=i+1;j<ch2.length;j++){
            if(ch2[i]>ch2[j]){
                char temp = ch2[i];
                ch2[i]=ch2[j];
                ch2[j]=temp;
            }
        }
       }


       if(Arrays.equals(ch1, ch2)){
        System.out.println("they are Anagram strings");
       }
       else{
        System.out.println("they are not anagram strings");
       }
       
        
    }
}