package Patterns.StarAndAlphabetPatterns;
public class PatternName {
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                if((i==0 && j>0 && j<=(n-1)/2) || (i>0 && i<(n-1)/2  && j==0) || (j>0 && j<(n-1)/2 && i==(n-1)/2) || (i==n-1 && j<(n-1)/2)|| (i>(n-1)/2 && i<n-1 && j==(n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            //print a
            for(int j=0;j<n;j++){
                if((i==0 && j>0 && j<(n-1)/2) || (j==0 && i>0)   || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // print H
            for(int j=0;j<n;j++){ 
                if((i==(n-1)/2 && j<=(n-1)/2 )|| j==0 || j==(n-1)/2 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

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
            System.out.print(" ");
            // print l
            for(int j=0;j<n;j++){
                if(j==0 || i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            // print space between first and last name
            for(int j=0;j<n;j++){
                System.out.print(" ");
            }
            System.out.print(" ");

            // print D
            for(int j=0;j<n;j++){
                if((j==0) || (j<(n-1)/2 && (i==0 || i==n-1)) || (j==(n-1)/2 && i>0 && i<(n-1))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // print h
            for(int j=0;j<n;j++){
                if((i==(n-1)/2 && j<=(n-1)/2 )|| j==0 || j==(n-1)/2 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // print i
            for(int j = 0;j<n;j++){
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
            System.out.print(" ");

            // print l again
            for(int j=0;j<n;j++){
                if(j==0 || i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            
            // print o
            for(int j=0;j<n;j++){
                if(((j==0 || j==n-1) && i>0 && i<n-1) || (j>0 && j<n-1 &&(i==0 || i==n-1))  ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // print n
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
