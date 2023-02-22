# Question 1 Why do we need Static keyword in Java ? explain with an example
 A static keyword in java is mainly used for memory management. Suppose there is a variable whose value is same for all the objects of that class. So instead of creating and allocating memory for each object we can use static variable.
Static in method is used to we can use / access a method by the name of the class without creating an instance/ object of the class.
A static block can be used to run a code before main method

```java
public class Question1{
    public static void main(String[] args) {
        
    }
    static{ 
        // this will run before main
        System.out.println("Hey i am static block");
        SeniorCitizen.display(); // accessed without Creating object
    }
}
class SeniorCitizen{
    static int minimumAge;
    static{
        // this will run before main so minimum age will become 60 while printing
        minimumAge=60;
    }
    static void display(){
        System.out.println("minimum age : " + minimumAge);
    }
}
```
___
# Question 2 What is Class Loading and how does the java Program actually executes
 Class Loading is the process of loading class files in to jvm at run time.
It is divided into three phases
1. Loading :- In the loading it loads all the class files
1. Linking  :- it also has three phases :-
   1. Verify :- Check if the code meets the Java Standard
   1. Prepare :- allocate memory to static Variables
   1. Resolve :- Resolving all the classes because they may have reference to other class object
1. Initiliaize :- static block will be executed

___
# Question 3 :- Can we mark local Variable as static
 No we can’t declare a local variable as static

___
# Question 4 :- Why is the static block executed before the main method in Java
In Java, a static block is executed before the main method because it is executed when the class is first loaded into the JVM. Because sometimes it contains the initialization of the static so if that block will be executed after main their will be errors.


___
# Question 5 :- Why is a static method called as class method ?
 A static method is called class method Because it can be used without creating object of the class we can directly use the class Name to access the method as done in question 1.

___
# Question 6 :- What is the use of Static Block in Java ?
Static block is used to Execute some operations before the main method executes or before any object of the class is created. It is Mainly used to initialize  static variables.

___
# Question 7 :- Difference between static and  instance variable ?
 Memory to static variable is only allocated one no matter how many objects of the class are there , but for Instance variable each time memory will be allocated to variable whenever a new object will be created.

___
# Question 8 :- Difference between static and non static members .
In Java, there are two types of members: static and non-static (also known as instance). The main difference between the two is the way they are accessed and their lifetime.

1. **Static Members**: Static members are also known as class level members, as they are associated with the class, not with any specific instance of the class. They can be accessed using the class name and a dot (.) operator. There is only one instance of static members for the entire class and all instances of the class share it.
1. **Non-Static Members**: Non-static members are also known as instance level members, as they are associated with a specific instance of the class. They can be accessed using an instance of the class and a dot (.) operator. Each instance of the class has its own copy of non-static members.