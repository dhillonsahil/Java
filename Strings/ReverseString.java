package Strings;
public class ReverseString{
    public static void main(String[] args) {
        String str1 = "pwjava";
        String str2= "";
       int length=str1.length() -1;
        for(int i=length;i>=0;i--){
            str2+=str1.charAt(i);
        }
        System.out.println(str2);
    }
}