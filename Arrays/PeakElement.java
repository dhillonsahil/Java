package Arrays;

public class PeakElement {
    public static void main(String[] args) {
        boolean found = false;
        int[] arr = {1, 1, 3, 4, 2, 3, 5, 7, 0};
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("no peak element found ");
        }
    }
}
