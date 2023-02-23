# Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
```java
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

```
___
# Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all strings stored on odd indices of the array.
```java
public class OddIndexPrint {
    public static void main(String[] args) {
        String[] str ={"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        for(int i = 0;i<str.length;i++){
            if(i%2!=0){
                System.out.println(str[i]);
            }
        }
    }
}
```
___
# Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even elements.
```java
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
```
___
# Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method for calculating the minimum element.
```java
public class PeakElement {
    public static void main(String[] args) {
        boolean found = false;
        int[] arr = {1, 1, 3, 4, 2, 3, 5, 7, 0};
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("no peak element found ");
        }
    }
}
```