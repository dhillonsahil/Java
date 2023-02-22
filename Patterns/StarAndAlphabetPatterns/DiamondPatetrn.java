package Patterns.StarAndAlphabetPatterns;
public class DiamondPatetrn {
    public static void main(String[] args) {
        int rows = 7;
        for(int i=0;i<=rows;i++){
            for(int j=0;j<rows-i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            for(int k=0;k<i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows-1;i>0;i--){
            for(int j=0;j<rows-i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            for(int k=0;k<i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}