# Q1 - Given an array sorted in increasing order of size n and an integer x, find if there exists a pair in the array whose absolute difference is exactly x.(n>1)
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the difference to check : ");
        int x=scan.nextInt();
        System.out.print("Enter the length of array : ");
        int n=scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        boolean check = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]-arr[j]==x || arr[i]-arr[j]==-x){
                    check=true;
                }
            }
        }
        if(check){
            System.out.println("Yes there exists");
        }else{
            System.out.println("not exists");
        }
    }
}
```
___
# Q2 - Given an array of size n, find the total number of occurrences of given number x.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        int count =0;
        System.out.println();
        System.out.print("Check occurence of :");
        int x =scan.nextInt();
        for(int a:arr){
            if(a==x){
                count++;
            }
        }
        System.out.println("there are " + count +" occurences");
    }
}
```
___
# Q3 - Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers. There are no duplicates in the list.
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=1;i<=arr.length;i++){
            boolean found=false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i || arr[j]>n){
                    arr[j]=Integer.MIN_VALUE;
                    found=true;
                }
            }
            if(!found){
                System.out.println(i + " is missing");
            }
        }
    }
}
```