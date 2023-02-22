package BitManipulation;
import java.util.Scanner;

public class BitManipuplation2{
    public static void main(String[] args) {
        // get bit  // and with bitmask
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        // update bit
        Scanner scan = new Scanner(System.in);
        int oper = scan.nextInt();
        if(oper==1){
            int newNumber = bitMask | n;
        System.out.println(newNumber);
        } else if(oper ==0){
            int bitMaskNot=~bitMask; 
        int clearedNumber = bitMaskNot & n;
        System.out.println(clearedNumber);
        }else{
            System.out.println("error ! 404");
        }
        scan.close();
    }
}