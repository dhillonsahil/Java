package Patterns.NumberPatterns;
public class ArmStrong {
    public static void main(String[] args) {
        int n = 10000;
        for(int i=1;i<n;i++){
            if(isArmStrong(i) && i>9){
                System.out.println(i + " Number is Armstrong");
            }
        }
    }
    static boolean isArmStrong(int num){
        int original_num = num;
        int result =0;
        int n =0;

        // check number of digits
        while(original_num!=0){
            original_num/=10;
            n++;
        }
        original_num=num;

        // find sum of digits raised to the power number of digits
        while(original_num!=0){
            int remainder=original_num%10;
            result+=(Math.pow(remainder, n));
            original_num/=10;
        }
        return (result==num);


    }
}
