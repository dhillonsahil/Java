# Write a Program to Display Date in Java
Answer :- 

```java
package Api;
import java.time.*;
import java.util.Date;

public class DisplayTime {
    public static void main(String[] args) {
        // Method 1
        LocalDate dt1 =  LocalDate.now();
        System.out.println(dt1);
        
        // Type 2
        Date dt = new Date();
        System.out.println(dt.getTime());
        System.out.println(dt);

        // Type 3
        java.sql.Date dt2 = new java.sql.Date(dt.getTime());
        System.out.println(dt2);

        //Type 4
        java.util.Calendar cal = java.util.Calendar.getInstance();
        System.out.println(cal.getTime());

    }
}
```

# Question 2 : Write a Program to Convert a Date to a string format of MM/DD/YYYY ?
Answer :-
```java
package Api;
import java.util.*;
import java.time.*;

public class DateTime2 {
    public static void main(String[] args){
        LocalDate d1 = LocalDate.now();
        String date = d1.getMonthValue()+"/"+d1.getDayOfMonth()+"/"+d1.getYear()
        System.out.println(date);
    } 
}
```

# Question 3 : What is the difference between collections and streams ? explain with an example.
Answer :-  collection classes are used to store data and if we want to perform some operations with the data but that shouldn't reflect any change in our collection so we can use a stream.
A stream can be of two types : - parallel stream and simple stream.

the main feature of the stream class is that we can only use a stream once. if after using a stream once we run a stream again, we will always end up with an error.

A stream mainly uses a Functional Interface.

```java
package Api;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;

public class Learn_Stream{
    public static void main(String[] agrs){
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Stream<Integer> str = list.stream();
        Stream<Integer> str1 = str.map(n->n*n);
        
        str1.forEach(n->System.out.println(n));
    }
}
```

# Question 4 :- What is enum in java ? explain with an example ?
Asnwer :- enum in Java is a user defined data type. all the values of enum are constant. A enum can contain method, constructors and variables also like any class. it is used whenever we have predefined named constants.each enum constant is a instance of enum type and defined as the public static and final. For each constant constructor is called.

```java
package Api;

public class LearnEnum {
    public static void main(String[] args) {
        Days dy = Days.MONDAY;
        System.out.println(dy);
    }
}

enum Days{
    MONDAY,TUEDAY,WEDNESDAY,THRUSDARY , FRIDAY ,SATURDAY;
      
}
```

# Question 5 :- What are inbuilt annotations in java?
Answer :- Inbuild annotations are used so that a developer and compiler can also understands what is the purpose of the next Method/class/interface / variable.
There are many inbuilt annotations Like:-
@Deprecated
@Override
@Retention
@Documented
@Repetable