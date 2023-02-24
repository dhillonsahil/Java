package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times to rotate");
        int count=scan.nextInt();
        int arr[] ={1,2,3,4,5};
        rotateArray(arr, count);
        scan.close();

    }
    static void rotateArray(int arr[] ,int count){
        count=count%arr.length;
        int a=0;
        int ans[]= new int[arr.length];
        for(int i=arr.length-count;i<arr.length;i++){
                ans[a++]=arr[i];
        
        }
        for(int i=0;i<=arr.length-count-1;i++){
            
                ans[a++]=arr[i];
            
        }

        for(int e:ans){
            System.out.println(e);
        }
    }
}
