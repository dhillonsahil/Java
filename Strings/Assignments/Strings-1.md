## Question 1. What is a String in java  ?
A string is collection of characters in java which are enclosed with in the double quotes.
Example :- String name = “sahil”;

___
## Question 2. Types of String in java?
There are two types of strings in java:- 
1. Immutable string (non changeable )
1. Mutable string (changeable )

___
## Question 3.  In how many ways you can create string objects in java ?
Immutable string objects can be used by the following method :-

Example 1. :- String name = “sahil”;
Example 2 :- String name = new String(“sahil”);
Example 3 :- char ch[] = {‘s’, ‘a’ , ‘h’ , ‘i’ , ‘l’ }
                     String name = new String(ch);

Mutable String can be created like :- 
StringBuilder name = new StringBuilder(“sahil”);
StringBuffer name = new  StringBuffer(“sahil”);

___
## Question 4. What is a String constant pool?
A string constant pool is a memory location where objects are created for the Immutable type of String. It don’t allows duplicate value/ objects to be stored or created.

___
## Question 5. What do you mean by mutable and immutable objects ?
**Mutable** :-
> Mutable Strings are the String created using StringBuilder and StringBuffer class whose values can be created without creating a new object in the heap/memory and it refers to the same object after changing the value.

**Immutable** :- 
>immutable Strings are the strings whose values can’t be changed and while applying methods like concat to change the value. A new object is created with the value needed but the variable still refers to the old object in heap memory.
___
## Question 6. Where exactly is the String constant pool located in memory?
String constant pool is located inside the heap memory. New object for String class are created inside this area. or while creating mutable string jvm keep a refernce copy in the string constant pool.