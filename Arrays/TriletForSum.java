package Arrays;

public class TriletForSum {
    public static void main(String[] args) {
        int target=12;
        int ans=0;
        int arr[] = {1,4,5,6,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans + " triplet");
    }
}
