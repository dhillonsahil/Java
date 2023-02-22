package Strings;
public class CheckPangramWithoutMehtod {
    public static void main(String[] args) {
        String str1= "The quick brown fox jumps over lazy dog";

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

        

        // converting to Array
        char ch1[]=new char[str1.length()];
        for(int i=0;i<str1.length();i++){
            ch1[i]=str1.charAt(i);
        }

        // converting to lower case
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]>='A' && ch1[i]<='Z'){
                ch1[i]= (char)((int)ch1[i]+32);
            }
        }

        // cheking all char from a to z are present or not
        int ch2[]=new int[26];
        boolean check= true;
        for(int i=0;i<ch1.length;i++){
            ch2[(int)ch1[i]-97]++;
        }
        for(int n:ch2){
            if(n==0){
                check=false;
            }
        }
        if(check){
            System.out.println("this String is Pangram");
        }
        else{
            System.out.println("This String is not pangram");
        }
        
    }
}
