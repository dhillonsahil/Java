package Arrays;
import java.util.Arrays;
class Largest{
    int largestElement(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
public class LargestNumber {
    public static void main(String[] args) {
        Largest l = new Largest();
        int a[] ={3,10,30,18,27};
        int largestElement = l.largestElement(a);
        System.out.println(largestElement);
    }
}
