package Patterns.StarAndAlphabetPatterns;
public class LeftTriangle {
    public static void main(String[] args) {
        int rows = 7;
        // shuru mein i ko  hi rakha jab rak i<rows hai
        for(int i=1;i<=rows;i++){
            // hamne kya kia jab j <rows -i hai matlab pehli line mein 7-1 = 6 space and fir k =  k <=i hai matlab i=1 toh print 1 star
            for(int j=0;j<(rows-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
