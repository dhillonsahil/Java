package Patterns.StarAndAlphabetPatterns;
public class PrintPwSkills{
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++){
            // print P
            for(int j=0;j<n;j++){
                if(j==0 || j<(n-1)/2 && (i==(n-1)/2 || i==0) || (i>0 && i<(n-1)/2) && j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // print w
            for(int j=0;j<n;j++){
                if(j==0|| j==n-1 || (i==(n-1)/2 && j==(n-1)/2) || (i+j==n-1 && i>(n-1)/2) || (i==j &&i>(n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            
            // print space 
            for(int j=0;j<n;j++){
                System.out.print(" ");
               }
                System.out.print(" ");
            // print s
            for(int j=0;j<n;j++){
                if((i==0 && j>0 && j<=(n-1)/2) || (i>0 && i<(n-1)/2  && j==0) || (j>0 && j<(n-1)/2 && i==(n-1)/2) || (i==n-1 && j<(n-1)/2)|| (i>(n-1)/2 && i<n-1 && j==(n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }}
            System.out.print(" ");

            // print k
            for(int j=0;j<n;j++){
                if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }}
            System.out.print(" ");

            // print i
            System.out.print( " ");
            for(int j=0;j<n;j++){
                if( i==0 || i==n-1 || j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
             
            // print l
            for(int j=0;j<n;j++){
                if(j==0 || i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

             // print l again
             for(int j=0;j<n;j++){
                if(j==0 || i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
System.out.print("  ");
            // print s
            // print s
            for(int j=0;j<n;j++){
                if((i==0 && j>0 && j<=(n-1)/2) || (i>0 && i<(n-1)/2  && j==0) || (j>0 && j<(n-1)/2 && i==(n-1)/2) || (i==n-1 && j<(n-1)/2)|| (i>(n-1)/2 && i<n-1 && j==(n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }}
            System.out.print(" ");
            System.out.println();
        }
    }
}