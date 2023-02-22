## Question 1. Write a program to Print A,B,C,D,E,F,G,H using Pattern Programming Logic ?
> pattern A
```java
public class NewPatternA{
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0 && j>0 && j<(n-1)/2) || (j==0 && i>0)   || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0){
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
```
> Pattern B
```java
public class PatternB {
    public static void main(String[] args) {
        int n = 7;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || (i==0 &&j<(n-1)/2) || (j==(n-1)/2 && i>0 && i<n-1) || (i==n-1 && j<(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2)){
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
```
> Pattern C
```java
public class PatternC {
    public static void main(String[] args) {
        int n=11;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if( (i>0 && i<(n-1) && j==0) || (j>0 && j<(n-1)/2 && (i==0 || i==(n-1))) || j==((n-1)/2) && i==(((n-1)/2)+(((n-1)/2)-1)) || j==((n-1)/2) && i==1  ){
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
```

>Pattern D
```java
public class PatternD {
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((j==0) || (j<(n-1)/2 && (i==0 || i==n-1)) || (j==(n-1)/2 && i>0 && i<(n-1))){
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
```
> Pattern E
```java
public class PatternE {
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || i==(n-1)/2 || i==0 || i==n-1){
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
```
> Pattern F
```java
public class PatternF {
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || i==(n-1)/2 || i==0 ){
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
```
> Pattern G
```java
public class PatternG {
    public static void main(String[] args) {
        int n=11;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( (j<=(n-1)/2 && j>0 && i==0) || (j==0 && i>0 && i<(n-1)) || j<(n-1)/2 &&  j>0  && i==(n-1) || (j==(n-1)/2 && i>=(n-1)/2) || (i==(n-1)/2) && j<=(n-1)/2 && j>1 ){
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
```
> Pattern H
```java
public class PatternH {
    public static void main(String[] args) {
        int n=11;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==(n-1)/2 && j<=(n-1)/2 )|| j==0 || j==(n-1)/2 ){
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
```
___
## Question 2 :-  Write a program to print triangle pattern using Star Pattern Programming Logic ?
```java 
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
```
___
## WAP to print a hut inside star pattern 
```java
public class PatternLikeHut {
    public static void main(String[] args) {
        int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==0 || i==n-1 ||(j-i>=(n-1)/2) || i+j<=(n-1)/2){
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
```
___
## Question 4 :- Write a program to PW Skills using Pattern Programming Logic.
```java
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
```

___
## Question 5 :- Write a program to print your full name using Programming Logic ?
```java
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
```

