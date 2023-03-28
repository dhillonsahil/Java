# Question 1 : What is an interface in Java ?
Answer :- An interface in java is used to achieve the full abstarction. It is similar to abstraction , abstraction provides us the way to write methods which just has methods signature no method body , the class extending the abstract class gives the vody of that there was an issue that if a class extends a abstarct class it can't extend other class. So to solve the issue java introduced the interface , every class implements the interface so our class can still extend any other class. 

It is achieved with the help of the implements keyword

Syntax example :- 
```java
interface Car(){
    public void start();
    public void break();
    public void speed();
}
```

# 2 Question : Which modifiers are allowed for methods in any interface ? Explain with an example .
Answer :- 
in any interface only two access modifiers are allowed for any methods :-
1. abstract
2. public
```java

interface Car{
    public void start();
    abstract void brake();
}

class BMW implements Car{
    @Override
    public void start(){
        System.out.println();
    }
    public void brake(){

    }
}
```

# Question 3  : What is the use of interface in Java ? or why we use an interface in Java ?
Answer :- 
Interface in java is used because 
1. Provides complete abstraction
1. Possible to implement multiple interface at a time
1. While implementing we can extend any other class also.
1. Helps to achieve Loose Coupling
1. Different class can provide different Functionality for the same code.

# Question 4 : Difference between abstract class and interface in java ?
Answer :- 
| Abstract class | Interface |
|---------------|------------|
| Any class Extend only one abstract class at a time | Any class can implement more than one Interface at a single period of time |
| Can't extend any other class while extending abstract class | Can extend other class also |
| Normally used for partial abstraction | Complete abstraction |
| uses extends keyword | uses implements keyword |
| Abstract and non abstarct methods | default , static , private methods also available after java 8 version |
| use abtsract keyword with class and method signature | used interface keyword only with class name |

> example of abstract class

```java

abstract class Hey{
    abstract void disp();
    public void now(){

    }
}


class Hii extends Hey{
    public void disp(){
        System.out.println("Extended abstract clas");
    }
    
}
```
> example of interface
```java

interface Car{
    public void start();
    abstract void brake();
}

class BMW implements Car{
    @Override
    public void start(){
        System.out.println();
    }
    public void brake(){

    }
}
```