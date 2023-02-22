package Strings;
public class Reverse2 {
    public static void main(String[] args) {
        String str1 = "pwskills java";
        String str2[]=new String[str1.split(" ").length];
        str2 = str1.split(" ");
        String str3 = "";
        int length = str2.length-1;
        System.out.println(length);
        for(int i=length;i>=0;i--){
            if(i!=0){
                str3+=str2[i] + " ";
            }
            else{
                str3+=str2[i];
            }
        }
        System.out.println(str3);
    }
}
