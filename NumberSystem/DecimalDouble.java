package NumberSystem;
public class DecimalDouble{
    public static void main(String[] args) {
        Double n = 18.675;
        int digitNumber =  (int)Math.floor(n);
        int precisionDigits = 3;
        int decimal_binary = 0;
        double fractionalNumber = n-digitNumber;
        int pow = 1;
        while(digitNumber!=0){
            int rem = digitNumber %2;
            decimal_binary += rem*pow;
            pow*=10;
            digitNumber/=2;
        }

        // decimal values
        String s = Integer.toString(decimal_binary) + ".";
        while(precisionDigits>0 && fractionalNumber!=0){
            fractionalNumber*=2;
            int digit = (int)fractionalNumber;
            s+=digit;
            fractionalNumber = fractionalNumber-digit;
            precisionDigits--;
        }
        System.out.println(s);
        
    }
}