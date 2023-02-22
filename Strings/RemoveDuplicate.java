package Strings;
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
