package Patterns.NumberPatterns;
public class Pattern1{
    public static void main(String[] args) {
        int num=1;
        int n= 7;
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(num + " ");
                num+=1;
            }
            System.out.println();
        }
    }
}