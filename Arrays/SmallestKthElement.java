package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestKthElement {
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
        scan.close();
     }
}

