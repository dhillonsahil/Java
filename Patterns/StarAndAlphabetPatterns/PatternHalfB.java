package Patterns.StarAndAlphabetPatterns;
public class PatternHalfB {
    public static void main(String[] args) {
        int n = 7;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || (i==0 &&j<(n-1)/2) || (j==(n-1)/2 && i>0 && i<n-1) || (i==n-1 && j<(n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            // Two same Pattern in a row
            
            // System.out.print(" ");
            // for(int j=0;j<n;j++){
            //     if(j==0 || (i==0 &&j<(n-1)/2) || (j==(n-1)/2 && i>0 && i<n-1) || (i==n-1 && j<(n-1)/2)){
            //         System.out.print("*");
            //     }
            //     else{
            //         System.out.print(" ");
            //     }
            // }
            System.out.println();
        }
    }
}
