package Recursion;

public class FindFactorial {
    public static void main(String[] args) {
        System.out.println(FactRecur(4));;
    }
    private static int FactRecur(int n) {
        if(n==0){
            return 1;
        }
        return n*FactRecur(n-1);
    }
}
