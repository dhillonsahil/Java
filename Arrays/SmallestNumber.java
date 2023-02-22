package Arrays;
import java.util.Arrays;

class Smallest{
    int smallestelement(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
}
public class SmallestNumber {
    public static void main(String[] args) {
        Smallest s = new Smallest();
    int a[] = {5,1,3};
    int small = s.smallestelement(a);
    System.out.println(small);
    }
}
