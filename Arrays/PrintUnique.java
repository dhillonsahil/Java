package Arrays;

public class PrintUnique {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,2,1,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[j]!=-1){
                    arr[i] =-1;
                    arr[j]=-1;
                }
            }
        }
        for(int a:arr){
            if(a!=-1){
                System.out.println(a);
            }
        }
    }
}
