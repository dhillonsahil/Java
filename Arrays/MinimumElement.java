package Arrays;

public class MinimumElement {
    public static void main(String[] args) {
        int[] elements = {2,-3,5,8,1,0,-4};
        int min = 0;
        for(int element:elements){
            if(element<min){
                min=element;
            }
        }
        System.out.println(min);
    }
}
