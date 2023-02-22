package Sorting;
public class SelectionBort {
    public static void main(String[] args) {
        int marks[]= {7,8,3,1,2};
        for(int i=0;i<marks.length-1;i++){
            int smallest =i;
            for(int j =i+1;j<marks.length;j++){
                if(marks[smallest]>marks[j]){
                    smallest=j;
                }
            }
            int temp = marks[smallest];
            marks[smallest] = marks[i];
            marks[i]=temp;

            // check each step
            for(int n:marks){
                System.out.print(n);
            }
            System.out.println();
        }
        
    }
}
