package Arrays;
import java.util.Arrays;

public class RemoveDuplicate{
    public static void main(String[] args) {
        int nums[]={5,7,8,9,10,2,5,6,4,3};
        Arrays.sort(nums);
        int count=nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count--;
                }
            }
        }
        int noDuplicate[] =new int[count];
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                noDuplicate[j++]=nums[i];
            }
        }
        noDuplicate[j]=nums[nums.length-1];
        nums=noDuplicate;
        for(int a:nums){
            System.out.println(a);
        }
    }
}