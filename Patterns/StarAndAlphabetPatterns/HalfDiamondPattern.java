package Patterns.StarAndAlphabetPatterns;
public class HalfDiamondPattern {
    public static void main(String[] args) {
        int rows = 7;
        // hamne dekha ki agar rows 5 toh pehli line mein 4 fir 3 space matlab i = 1 se start hai toh space rows-i and * jitne i ki value hai
        for(int i=0;i<=rows;i++){
            for(int j=0;j<rows-i;j++){
                System.out.print(" ");
            }
            // now it will look like left triangle
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            // to make it look like pyramid we added this loop that if k<i-1 add stars
            // in 1st k =0 and i-1 = 0 so it will not print 
            // in 2nd loop of i k = 0 ;2-1=1; so it will print 1 star extra
            // in 3rd k =0 ; 3-1 = 2 so it will print 2 stars
            for(int k=0;k<i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}