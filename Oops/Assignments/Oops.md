
## Question 1 :- What is Inheritance in Java ?
Inheritance in Java is used so that we can use the properties and methods of a class in another class. It provides us the feature of Code reusability. 
The class which is being inherited is called Parent Class/ Super Class / Base Class.
The Inheritance is done with the help of the extend keyword and inheritance helps to reduce the number of lines of code in our project.
___
## Question 2 :- What is a superclass and subclass ?
> **Superclass** :- superclass is the class being inherited. It can only access it’s features.

> **Subclass** :- sub class is the class inheriting another class. It can access the properties and Methods of the parent class as well as it’s own.

```java 
public class Solution{
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.disp1();
        p.disp2();
        p.salary=70000;
        p.bonus=30000;
    }
}
class Employee{
    int salary;
    void disp1(){
        System.out.println("i am a employee");
    }
}
class Programmer extends Employee{
    int bonus;
    void disp2(){
        System.out.println("I am a programmer");
    }
}
```
___
## Question 3 :- How is inheritance implemented/achieved in Java ?
In Java inheritance is implemented using the extend keyword. But if we want to achieve multiple inheritance it is Achieved with the help if inheritance , inheritance is not implemented with extend we use implement in interface.
```java 
public class Try1{
    public static void main(String []args){
        Student s1 = new Student();
        s1.sleep();
    }
}
class Student extends Human{

    Student(){

    }
    void sleep(){
       System.out.println("student is sleeping");
    }    
}
class Human{
    void sleep(){
        System.out.println("I am going to sleep");
    }
}
```
## Question 4 :-  What is Polymorphism ?
Polymorphism is a Greek word Which Means Many Forms. Polymorphism can be achieved without or with the help of inheritance. Polymorphism refers to the ability of a class to provide different implementations of a method, depending on the type of object that is passed to the method.
___
## Question 5 :- Differentiate between method overloading and method overriding ?
**Method Overloading** :-
> Method overloading can be achieved no matter we use inheritance or not. In Method Overloading we are extending the functionality of a Method. In method overloading the Method’s need to have different type of Parameter list or different return types. 
Compile time Polymorphism

**Method Overriding** :- 
>Method overriding is achieved is we use the inheritance. In method over riding the return type , parameter list must be same of the both methods (overridden and overriding method ). 
The Parent class method which is again implemented in Child class according to their requirement is called Overriden method and The child class method is called overriding method.
Run time Polymorphism
___
## Question 6 :- What is an abstraction explained with an example ?
Abstraction is the process of showing essential features only while hiding the irrelevant information from the users.
Abstraction in Java  is achieved with the help of the abstract keyword. In abstraction a method don’t have any body , it has only method signature and we have to write abstract keyword in method signature. If there is any abstract method the class should also be defined as abstract. 
```java
public class abstraction {
    public static void main(String[] args) {
        Student sahil = new Student();
        sahil.disp();
    }
}
abstract class Human{
    int age;
    abstract void disp();
}
class Student extends Human{
    public void disp(){
        age=20;
        System.out.println("Hello i am a student my age is : "+ age);
    }
}
```
___
## Question 7 :- What is the difference between the final method and abstract method in Java ?
**Abstraction** :- As Discussed above abstract method is a method which don’t have any method body. Every class that is inheriting the Abstract class must implement the method in it. Other wise it will give a compile time error.
```java
public class abstraction {
    public static void main(String[] args) {
        Student sahil = new Student();
        sahil.disp();
    }
}
abstract class Human{
    int age;
    abstract void disp();
}
class Student extends Human{
    public void disp(){
        age=20;
        System.out.println("Hello i am a student my age is : "+ age);
    }
}
```
**Final Method**:- The final keyword is used with a method so we can’t make changes to that method or property. If final is used with a class then we can’t inherit the class. We can’t override the final method.
```java
public class abstraction {
    public static void main(String[] args) {
        Student sahil = new Student();
        sahil.disp();
    }
}
abstract class Human{
    int age;
    final void disp(){
        System.out.println("Hello");
    };
}
class Student extends Human{
    public void disp2(){
        age=20;
        System.out.println("Hello i am a student my age is : "+ age);
    }
}
```
___
## Question 8 :-  What is the final class in Java ?
Final class in Java is used so that no one can inherit the class . If we are creating a final class that is final we must use the final keyword. And if a class is final by nature it can’t be abstract. If we use final we can’t use the key benefits of the Object oriented Programming

___
## Question 9 :- Differentiate between abstraction and Encapsulation ?
| Abstraction | Encapsulation |
| ------------| --------------|
|Hide’s Unnecessary information from the users| Combines data members and methods in a single entity to protect data from outer world.|
|We use abstract classes and abstract methods|We use the getters and setters to access the data members|
|Objects are encapsulated to perform abstraction| We can encapsulate no matter we use abstraction or not.|
| This is the process of gaining information | This is the process of containing and hiding information |
| Solves issues at design levels | Solves the issues at implement level by using private |

___
## Question  10 :- Difference between run time Polymorphism and compile time polymorphism ?
| Run time Polymorphism    | Compile time Polymorphism |
| -------------------------| --------------------------|
| Inheritance is used      | No need to use inheritance |
| Method Over riding is used |Method overloading is used |
| With in parent class and child class | With In the same class |
| Error at run time | Error at compile time |
