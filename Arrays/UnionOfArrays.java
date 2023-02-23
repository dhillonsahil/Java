package Arrays;

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
