package Sorting;
public class BubbleSort{
    public static void main(String[] args) {
        int marks[]={7,8,3,1,2};
        

        for(int i=0;i<marks.length-1;i++){
            for(int j=0;j<marks.length-1-i;j++){
                if(marks[j]>marks[j+1]){
                    int temp = marks[j+1];
                    marks[j+1]=marks[j];
                    marks[j]=temp;
                }
            }
            
        }

        // print array
        for(int n:marks){
            System.out.print(n);
        }
    }
}