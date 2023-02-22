package Patterns.StarAndAlphabetPatterns;
public class DownwardTriangle {
   public static void main(String[] args) {
    int rows = 7;
    // i ko shuru mein  hi rows ke barabar kra dia or jab tak j i se less hai * print jota rahega
    for(int i=rows;i>0;i--){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
   } 
}
