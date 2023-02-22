package Arrays;
class Reverse{
    int[] reverseArray(int arr[]){
        int temp[]=new int[arr.length];
        int len = arr.length-1;
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[len-i];
        }
        arr=temp;
        return arr;
    }
}
public class RverseArray {
    public static void main(String[] args) {
        int arr[] = {5,3,7,8,1,2};
        Reverse r = new Reverse();
        arr=r.reverseArray(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
