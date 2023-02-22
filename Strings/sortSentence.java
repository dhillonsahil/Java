package Strings;
class Solution {
     
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String str[]=new String[10];
        String s2[]=s.split(" ");
        for(int i=0;i<s2.length;i++){
            String x = s2[i];
            int a = x.charAt(x.length()-1)-'0';
            str[a]=x.substring(0,x.length()-1);
        }
        String z="";
        for(String a:str){
            if(a!=null){
            z+=a+ " ";}
        }
        System.out.println(z.substring(0, z.length()-1));
    }
 }