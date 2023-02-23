package Arrays;

public class PairsForSum {
    public static void main(String[] args) {
        int target=7;
        int ans=0;
        int arr[] = {4,6,3,5,8,2};
        for(int i = 0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]==target-arr[j]){
                    ans++;
                }
            }
        }
        System.out.println(ans + " pairs");
    }
}
