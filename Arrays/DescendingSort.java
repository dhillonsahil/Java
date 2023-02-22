package Arrays;
import java.util.Arrays;
public class DescendingSort {
    public static void main(String[] args) {
        int nums[]={5,1,7,9,3,4,8,6};
        Arrays.sort(nums);
        int length=nums.length-1;
        int temp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i]=nums[length-i];
        }
        nums=temp;
        for(int a:nums){
            System.out.print(a+ " ");
        }
    }
}
