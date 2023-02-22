package Patterns.StarAndAlphabetPatterns;
public class PatternTriangle {
    public static void main(String[] args) {
        int n=11;
        for(int i= 0;i<n;i++){
            for(int j=0;j<n;j++){
                if( (i==0 && j==(n-1)/2) || i==(n-1)/2 || i+j==(n-1)/2 || j-i==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            if(i<(n-1)/2){
                System.out.println("");
            }
        }
    }
}
