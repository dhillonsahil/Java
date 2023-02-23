# Q1 - Given an unsorted array arr[] of size N having both negative and positive integers, place all negative elements at the end of array without changing the order of positive elements and negative elements
```java
import java.util.Scanner;
public class SortingNegativeAtEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // input
        System.out.println("Enter a value of n : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int[] result = new int[n];
        int index=0;
        // sorting positive elements first
       for(int a:arr){
           if(a>=0){
               result[index]=a;
               index++;
           }
       }

       // sorting negative elements
       for(int a:arr){
           if(a<0){
               result[index]=a;
               index++;
           }
       }

       // printing sorted array
        for(int a:result){
            System.out.print(a + " ");
        }
        scan.close();
     }
}
```
___

# Q2 - Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find union between these two arrays and rint the number of elements of the union set. Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
```java
import java.util.Arrays;
import java.util.Scanner;

public class UnionOfArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // a input
        System.out.println("Enter length of a : ");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of  array a : ");
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }

        // b input
        System.out.println("Enter length of b : ");
        int m = scan.nextInt();
        int[] b = new int[m];
        System.out.println("Enter elements of  array b : ");
        for(int i=0;i<m;i++){
            b[i]=scan.nextInt();
        }
        int c[] = new int[a.length+b.length];
        int ind = 0;

        // adding values of a and b in c
        for(int e:a){
            c[ind]=e;
            ind++;
        }
        for(int e:b){
            c[ind]=e;
            ind++;
        }

        // sorting c
        Arrays.sort(c);

        // printing
        for(int i=0;i<=c.length-1;i++){
            if(i==0 || c[i]!=c[i-1]){
                System.out.println(c[i]);
            }
        }
scan.close();

     }
}

```

___
# Q3 - Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the size of Array to create : ");
        int n =scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of arrays ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        System.out.println("Enter the value of k , k will be the smallest number");
        int k = scan.nextInt();

        Arrays.sort(arr);

        System.out.println(arr[k-1]);
     }
}
```

___
# Write a Java program to test the equality of two arrays.
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        // a
        System.out.print("Enter the size of Array to create : ");
        int n =scan.nextInt();
        int arrA[] = new int[n];
        System.out.println("Enter the elements of array a");
        for(int i=0;i<n;i++){
            arrA[i]=scan.nextInt();
        }

        // b
        System.out.print("Enter the size of Array to create : ");
        int m =scan.nextInt();
        int arrB[] = new int[m];
        System.out.println("Enter the elements of array a");
        for(int i=0;i<m;i++){
            arrB[i]=scan.nextInt();
        }
        System.out.println(Arrays.equals(arrA , arrB));


     }
}

```