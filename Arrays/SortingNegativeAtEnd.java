package Arrays;

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
