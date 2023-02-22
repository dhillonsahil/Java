package Arrays;
class TrySort{
    int arr[];
    TrySort(int arr[]){
        this.arr=arr;
    }
    void sortArray(){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    int[] getSortedArray(){
        return arr;
    }
}

public class SortArrayWithLoop {
    public static void main(String[] args) {
        int arr[] = {6,1,8,3};
        TrySort t = new TrySort(arr);
        t.sortArray();
        arr=t.getSortedArray();
        for(int n:arr){
            System.out.print(n + " ");
        }
    }
}
