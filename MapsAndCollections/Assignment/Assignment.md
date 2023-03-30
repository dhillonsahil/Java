# Question 1 : What is Map in Java ?
Answer :- Map in Java is used to store values in the pair (key,value). The key must be unique for each for value. If we are having more than one values with same keys only 1st will be included and other will be simply ignored

# Question 2 :  What are the commonly used implementations of Map in Java ?
Answer - In java the mostly used implementations of map are HashMap , LinkedHashMap . The LinkedHashMap Stores the order but the HashMap Don't.

# Question 3  : What is the difference between HashMap and TreeMap ?

Answer :- The Data stored in the HashMap is not in the Sorted order , but the data stored in the TreeMap is stored in the Sorted Order.

# Question 4 :  How do you check if a key exists in a Map in java ?
Answer :- We can check that using the .containsKey(key) method 
example :- 
```java
// package LearnGenrics;
import java.util.*;
public class ClassGenrics {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(2, "sahil");
        map.put(3, "ankit");
        boolea tr = map.containsKey(3);
        System.out.println(tr);
    }
}
```

# Question 5 : What are Genrics in Java ?
Answer : Genrics in java is used with any class or Collection framework classes so that we can make sure the we are entring in to a Object of any class if of a particular type. It provides us type - safety.

```java
import java.util.*;

class GenricsDemo{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("sahil");
        names.add("ajay");
    }
}
```
> If we will add any other type of data except String in names ArrayList , it will give us an error.

# Question 6 : What are benifits of using Genrics in Java ?
Answer :- By using Genrics we can make sure that only same type of data is being added to the object. So it will prevent us from producing errors.
Code size can be reduced (if we don't need to check data using if statments) , better performace.

# Question 7 : What is a Genric class in Java ?
Answer : A genric class in java is a class which can work with different type of data. if we want to use genrics we have to use the <> in which we have to tell the data type like :- <Integer>

# Question 8 : What is a Type Parameter in Java Genrics ?
Answer :- A type parameter is given in a class Genrics angle bracket . so the class receving it will now that we are passing this type of data . It is represented by the <E> or <T> i.e. usually one single letter.

# Question 9 : What is a genric method in java ?
Asnwer :- A generic method is a method that can work with different data types.  the method can be used with different data types without having to write a separate method for each data type.

# Question 10 : What is the difference between ArrayList and ArrayList<T> ?
Answer  :- An ArrayList can be used to insert any kind of data like, Ineteger , String , Any other object in a single ArrayList. Where ArrayList<T> will receive only 1 single type of data.