# Collection Framework
it is also called collection api or collection hierarchy. framework :- (readily available solution)

## Need of collection
**Arrays disadvantage**:- 
1.  size is fixed
1. Stores only homogenous type(same type) of data.
1. No inbuilt Methods. (like to add,retreive more data we have to use index , sort)

To solve this disadvantages java has Collection framework
which has set of Interfaces & classes to store the data , and to add , delete , retreive , Manipulate the data.

They are dynamic in size(not fixed)

>**Collection is released in Java 1.2 Version**

The data stored in collection is stored as object

## Collection Hierarchy
Major 3 interface
1. List (Arraylist , Linked list , VEctor classes (stack is sub class of vector))
1. Queue ( has a dequeue sub interface)
1. Set ( has a SortedSet sub interface (Navigable sub interface also))

Collection(interface) is the Parent interface of all the interfaces. (list , queue , Set extends interface). Iterable is the parent interface of Collection interface.

## Array list 

>order of insertion is preserved

>Duplicates allowed

> implements List

>Homogenous & heterogenous

> can add based on index but not preferred so use Linked list for that
```java
ArrayList al1 = new ArrayList();

ArrayList al2 = new ArrayList();
al2.add(300);
al2.add(400);

al1.add("Sahil") ;  // adds at last because no index specified

al1.add(1,"Dhillon"); // adds Dhillon at index 1

al1.add(100) ;  

al1.add(al2) // output :- ["SAHIL","Dhillon",100,[300,400]]

al1.addAll(al2) // output :- ["SAHIL","Dhillon",100,300,400]

al1.add(100) // allowed duplicates output :- ["SAHIL","Dhillon",100,300,400,100]
```


// index based insertion is Not preferred if we want to add like this use Linked List

>example
```java
package LearnCollection;

import java.util.*;

public class Launch_AL1{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        // stores arrays of object

        // all information is stored as object
        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println(al.contains("Sahil"));
        System.out.println(al);

        System.out.println("*****************************************");
        ArrayList al2 = new ArrayList();
        al2.add("j");
        al2.add(1);
        al2.add(1.1);
        System.out.println(al2);

        System.out.println("*****************************************");
        System.out.println("After adding al2 in al ");
        al.addAll(al2);
        System.out.println(al);
        
        System.out.println("*****************************************");
        ArrayList al3 = new ArrayList();
        al3.add("PW skills");

        al.addAll(2,al3);   // add Collection to a specific Index
        // index based insertion is Not preferred if we want to add like this use Linked List
        al.add(3,"SAHIL");   // add string to a specific index
        System.out.println(al);
    }
}
```

> example 2

```java
package LearnCollection;


import java.util.*;

public class Launch_AL2 {
    public static void main(String[] args) {
        ArrayList al =new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        int index =  al.indexOf(200);
       System.out.println(index);
       System.out.println(al.size());
       
       al.ensureCapacity(10); // allocates 10 minimum capacity ( we are using only 3 so 7 are going waste)
       al.trimToSize(); // remove the empty space so makes it 3
       System.out.println(al.size());
    }
}

```

1. The array class implements the List Interface
1. It uses a dyanmic array to store the duplciate element of different data types.
1. The ArrayList Class Maintains the insertion of order and is non-synchronized.
1. The elements stored in the array are randomly accessed.