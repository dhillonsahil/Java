package Recursion;

public class FindPowerRecur {
    public static void main(String[] args) {
        System.out.println(findPower(7, 5));
    }
    public static int findPower(int x, int n) {
        if(x==0)
        {
            return 0;
        }
        else if(n==0){
            return 1;
        }
        return x*findPower(x, n-1);
    }
}
