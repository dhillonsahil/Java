package Arrays;

public class PrintPositive {
    public static void main(String[] args) {
        int[] arr = {2, 6, -5, -1, 0, 4, -9};
        for(int a:arr){
            if(a>=0){
                System.out.println(a);
            }
        }
    }
}
