## Question 1 What is Mutable String in java ? Explain with an example .
 A mutable String is a string object which is created using the StringBuffer and StringBuilder class. If we want to make some changes like appending it or reversing it. The changes reflect in the same object . no new object is created so we don’t need to change the reference of the variable.
```java
public class MutableString {
    public static void main(String[] args) {
        StringBuffer name =new StringBuffer("sahil");
        name.append(" dhillon");
        System.out.println(name);
    }
}
```
___
## Question 2 :- WAP to reverse a string
```java
public class ReverseString{
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("PWSKILLS");
        name.reverse();
        System.out.println(name);


        
    }
}
```
___
## Question 3 :- WAP to reverse string while preserving the position of words.
```java
public class ReverseAtSamePosition {
    public static void main(String[] args) {
        String str = "Think twice";
        String str2 = "";
        String arr[] = str.split(" ");
        for (String element : arr) {
            for (int i = element.length() - 1; i >= 0; i--) {
                str2 += element.charAt(i);
            }
            str2 += " ";
        }
        System.out.println(str2);
    }
}
```
