package Strings;
public class Reverse3 {
    public static void main(String[] args) {
        String str1 = "pwskills java";
        String str2 = "";
        String str3[]=str1.split(" ");
        for(String s:str3){
            for(int i=s.length()-1;i>=0;i--){
                str2+=s.charAt(i);
            }
            str2+=" ";
        }
        System.out.println(str2);
    }
}
