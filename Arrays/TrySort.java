package Arrays;
public class TrySort{
    public static void main(String[] args) {
        int nums[]={6,3,9,7,5};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println("sorted array : ");
        for(int n:nums){
            System.out.print(n+ " ");
        }
    }
}