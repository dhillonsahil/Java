package Recursion;

public class PrintUsingRecur {
    public static void main(String[] args) {
        // System.out.println("Hello, World!"); 
        disp(5);
    }
    public static void disp(int n){
        if(n>0){
            System.out.println(n);
            disp(n-1);
        }
    }
}
