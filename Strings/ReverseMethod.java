package Strings;
public class ReverseMethod {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        reverse2(str);
        System.out.println(str);
    }
    static void reverse2(StringBuilder str){
        for(int i=0;i<str.length()/2;i++){
            int front = i;
            int back = str.length()-1-i;
            
            char fr = str.charAt(front);
            char bk = str.charAt(back);
            str.setCharAt(front, bk);
            str.setCharAt(back, fr);
        }
    }
}
