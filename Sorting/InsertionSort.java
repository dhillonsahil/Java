package Sorting;
public class InsertionSort {
    public static void main(String[] args) {
        int marks[]= {7,8,3,1,2};
        for(int i=1;i<marks.length;i++){
            int current = marks[i];
            int j = i-1;
            while(j>=0 && current <marks[j]){
                marks[j+1] = marks[j];
                j--;
            }
            marks[j+1]= current;

            for(int n:marks){
                System.out.print(n);
            }
            System.out.println();
        }
        
    }
}
