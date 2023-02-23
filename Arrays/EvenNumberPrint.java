package Arrays;

public class EvenNumberPrint {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        for(int a:arr){
            if(a%2==0){
                System.out.println(a);
            }
        }
    }
}
