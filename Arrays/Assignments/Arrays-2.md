## Question 1. What is the default Value of array for different datatypes  ?
Answer :- 
* String  :- null
* int :- 0
* double :- 0.0
* Boolean :- false
* Object :- null

___
## Question 2. Can you pass negative number in Array size?
No array size can’t be negative if done so it will give a NegativeArraySizeException . but it can be 0 or positive.

___
## Question 3 :- Where does array store in jvm ?
 Array is stored in the heap memory. But the variable reference of the array is stored in stack with the memory location of array in heap memory
 ___
 ## Question 4. What are disadvantages of Array?
1.  Size can’t be increased or decreased.
1. Array can only store homogenous type of data.
___
## Question 5. What is an anonymous array ? Give an example ?
An array which is not stored/assigned a variable name. these types of array can be used only one time.
```java
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.add(new int[] { 2, 7, 2, 1 }));
    }

    static int add(int nums[]) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }
}

```
___
## Question 6. What are different ways to transverse an array ?
To transverse an array we can us a simple for loop, starting from 0 to (array_name.length-1) . or we can use a Enhanced for loop.
In which we don’t need to keep in mind the length of the array.
___
## Question 7. Write the difference between the length and the length() method ? Give an example ?
The length is the property of an array that’s why it done have parenthesis at the end. And the length() method is the method in the String class . which gives us the Length of the string.

> Example of Length Property
```java 
public class Test{
    public static void main(String[] args){
        String names[]={"sahil" , "mohit","parveen"};
        System.out.println(names.length);
    }
}

```
> Example of Length Method
```java 
public class Test{
    public static void main(String[] args){
        String names="sahil";
        System.out.println(names.length());
    }
}
```