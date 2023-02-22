# Question 1 :- What is a  Constructor ?
A Constructor in a java used to Create a object and initialize the values of the instance variables. It has the same name as The class. A Constructor can have a access modifier but no return type not void also. If we give no constructor java will make a  default constructor by its own.

___
# Question2 :- What is Constructor Chaining ?
Constructor chaining is calling one  constructor from another constructor . it can be within the same class or from base class. 
This can be done with the help of this() keyword and super() keyword.
It can only be used in the first line of Constructor otherwise it will give a error.

```java
public class ConstructorChaining{
    public static void main(String []args){
        JavaTest jt = new JavaTest("sahil");
    }
}
class Test{
    Test(){
        System.out.println("I am a Base Class Constructor");
    }
}
class JavaTest extends Test{
    JavaTest(){
        super();
        System.out.println("I am a child class Constructor ");
    }
    JavaTest(String name){
        this();
        System.out.println("Hi " +name + " welcome to JavaTest Constructor");
    }
}
```
___
# Question 3 :- Can we call a Subclass Constructor from a super class ?
No we can’t call a subclass constructor from a super class
___
# Question 4 :- What happens if you keep a return type for a constructor?
 This will give a compilation error.

___
# Question 5 :- What is No-args constructor ?
No Args constructor don’t accepts any value , it is used to create a copy of the object. It don’t initialize the values of the instance variables .

___
# Question 6  :- How is a Non argument constructor different from default constructor ?
Default constructor is automatically created by the Java but non argument constructor can be used to do any operations that don’t need any arguments or values.

___
# Question 7 :- Why do we need Constructor Overloading ?
Constructor overloading is used when we want to make instances of class but we want to use different number of arguments for different objects so we can use the Construcor overloading in that case .

___
# Question 8 :- What is default Constructor in Java Explain with an example ?
Default constructor in java is Created by the java compiler. We can use it without defining by our own. It has no arguments and performs no special operations.

```java
class Solution{
public static void main(String[] args){
Student sahil = new Student();
}
}
class Student{
void display(){
System.out.println(“Hello Bachoo”);
}
}

```