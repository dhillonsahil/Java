package Patterns.StarAndAlphabetPatterns;
public class SandGlassPattern {
    public static void main(String[] args) {
        int rows = 7;
        // hamne dekha ki agar rows 5 toh pehli line mein 4 fir 3 space matlab i = 1 se start hai toh space rows-i and * jitne i ki value hai
        for(int i=rows;i>0;i--){
            for(int j=0;j<rows-i;j++){
                System.out.print(" ");
            }
            // it will look like left triangle if space not added after * .
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            if(i>1){
                System.out.println();
            }
        }
        for(int i=0;i<=rows;i++){
            for(int j=0;j<rows-i;j++){
                System.out.print(" ");
            }
            // it will look like left triangle if space not added after * .
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
