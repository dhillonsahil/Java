package Recursion;

public class FindPowerLogNLevel {
    public static void main(String[] args) {
        System.out.println(powerNStackLevel(7, 2));
    }
    private static int powerNStackLevel(int x,int n) {
        // for stack level log(n) ( stack height  = log(n))
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return powerNStackLevel(x ,n/2)*powerNStackLevel(x, n/2);
        }else{
            return powerNStackLevel(x ,n/2)*powerNStackLevel(x, n/2)*x;
        }

    }
}
