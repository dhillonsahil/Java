package BitManipulation;
public class BitManipulation1{
    public static void main(String[] args) {
        // get bit  // and with bitmask
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        if((bitMask & n) ==0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }

        // set bit    // or with bit mask
        int newNumber = bitMask | n;
        System.out.println(newNumber);

        // clear bit  // and with bitmask not
        int bitMaskNot=~bitMask; 
        int clearedNumber = bitMaskNot & n;
        System.out.println(clearedNumber);


    }
}