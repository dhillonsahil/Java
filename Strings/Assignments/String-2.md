## Question 1. Write a simple String Progra
```java
import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
String name = scan.nextLine();
System.out.println(name);
}
```
___
## Question 2. How do you concatenate two strings in java? Give an example ?
```java 
public class Main{
public static void main(String[] args){
String name = "sahil";
name = name.concat("dhillon");
System.out.println(name);
}
}
```
> method 2
```java
public class Main{
public static void main(String[] args){
String name = "sahil";
name = name + "dhillon";
System.out.println(name);
}
}
```
___
## Question 3.  How do you find the length of a string in java Explain with an example ?
we can find the length of a string using the length() method
```java
public class Main{
public static void main(String[] args){
String name = "sahil";
System.out.println(name.length());
}
}
```
___
## Question 4. How do you compare Two strings in java ? Give an Example
In java if we want to compare that are two strings reffering to same object or not then we can use == equals to operator. But if we want to compare values we can use equals() or equalsIgnoreCase() method
```java
public class Main{
public static void main(String[] args){
String name = "sahil";
String name1 = "sahil";
String sirname = " dhillon";
String newName = "Sahil";
System.out.println(name.equals(sirname));
System.out.println(name.equalsIgnoreCase(newName));
System.out.println(name==name1);
System.out.println(name==newName);


}
}
```
___
## Question 5. Write a Program to find length of the String “refrigerator” ?
```java
public class Main{
public static void main(String[] args){
String word ="refrigerator";
System.out.println(word.length());


}
}
```
___
## Question 6. Write a program to check if the letter ‘e’ is present in the word Umbrella.
```java 
public class Main{
public static void main(String[] args){
String word ="Umbrella";
System.out.println(word.contains("e"));


}
}
```
___
## Question 7. Write a program to delete all consonants from the string “Hello, have a good day”.
```java
public class Main {
    public static void main(String[] args) {
        String line = "hello, have a good day ";
        char new_str[] =new char[line.length()];
        int count = 0;
        for(int i=0;i<line.length();i++){
if(line.charAt(i)=='a' || line.charAt(i)=='e'  || line.charAt(i)=='i' || line.charAt(i)=='o' || line.charAt(i)=='u'){
                new_str[count]=line.charAt(i);
                count++;
            }
        }
        String ns = new String(new_str);
        line=ns;
        System.out.println(line);
    }
}
```