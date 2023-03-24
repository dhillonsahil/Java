package Recursion;

public class FindOccurenceRecu{
    public static void main(String []args){
        int arr[] = {1,2,3,4,5};
        int index = findIndex(arr , 0 , 5);
        System.out.println("Index is : "+index);
    }
    public static int findIndex(int []arr ,int n , int numberToChecl){
        if(n==arr.length){
            return -1;
        }
        if(arr[n]!=numberToChecl){
            return findIndex(arr, ++n, numberToChecl);
        }else{
           return n;
        }
    }
}