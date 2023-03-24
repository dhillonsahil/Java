package Recursion;

public class CheckSortedRecu {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       int al = arr.length-1;
       boolean result = checkSort(arr ,al);
       System.out.println(result);

    }
    static boolean checkSort(int arr[] , int a){
        if(a==0){
            return true;
        }
        if(arr[a-1]<arr[a]){
            
            return checkSort(arr, a-1 );
        }else{
            return false;
        }
    }
}
