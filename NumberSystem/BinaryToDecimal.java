package NumberSystem;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int n = 101;
        int power=1;
        int decimal = 0;
        while(n!=0){
            int remainder  = n%10;
            decimal+=remainder*power;
            power*=2;
            n/=10;
        }
        System.out.println(decimal);
    }
}