package Patterns.StarAndAlphabetPatterns;
public class RightTriangle{
    public static void main(String[] args) {
        int rows = 7;
        // i shuru mein 0 hai jab tak rows se kam rahegi  or j i se kam rahega * print hota rahega then next line 
        for(int i=0;i<rows;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}