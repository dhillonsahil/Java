## Question 1. What do you mean by an Array ?
An Array is used to Store More than one values in a single variable name. it refers to index collection of fixed number of same type of data elements.
___
## Question 2. How to create an array?
first we declare a Array.
Example :- 
> int a[] or int[] a or int []a;
Array Construction :- 
We can create it using :- a= new int[array_size];
Or at the time of declaration :- int a[] = new int[array_size];
Or with values = int a[] = {5,3,7,9,4}

___
## Question 3.  Can we change the size of an array at run time ?
No we can’t change the size of an array at runtime.
___
## Question 4. Can you declare an array without assigning the size of an array ?
 yes we can declare an array without assigning the size of an array , but before using the array we need to assign the size.
 ___
 ## Question 5. What is the default value of an array ?
 Default value of an array is the default values of the data types that are used to create an array. If array is of int type the default values are 0  , for String data type the default values of the array data elements are null.

___
## Question 6. What is an  1D array with an example ?
An 1D array are normally used and simple form of an array. They are linear and can be accessed individually by the number and indexing starts from the 0 in the array.

```java 
public class LearnArray {
    public static void main(String[] args) {
        
        int nums[] = {2,6,5,7};
        int sum=0;
        for(int a:nums){
                sum+=a;
            
        }
        System.out.println("sum "+sum);
    }
}

```
___
## Question 7. Write a program on a 2d array ?
```java 
public class LearnArray {
    public static void main(String[] args) {
        
        int nums[][] = {{2},{7,2,1}};
        int sum=0;
        for(int a[]:nums){
            for(int n:a){
                sum+=n;
            }
        }
        System.out.println("sum "+sum);
    }
}
```
___
