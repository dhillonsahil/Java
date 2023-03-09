package Recursion;

public class FibonacciRecur {
    public static void main(String[] args) {
        findFibonacci(0, 1, 7);
    }

    public static void findFibonacci(int n1,int n2,int n3) {
    if(n3==0){
        return;
    }
        int n4 = n1+n2;
        System.out.println(n1);
        findFibonacci(n2, n4, --n3);
    }
}
