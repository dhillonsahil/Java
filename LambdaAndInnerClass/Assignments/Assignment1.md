# Question 1 : What is the lambda expression in java ?
Answer :- Lamdba expression in java is used to implement an interface which have only one method . It is mainly used when we have to use the interface only 1 time and we don't want to create a class which implements interface.

example :-
```java
interface Car{
    public void disp();
}

public class  Try{
    public static void main(String[] args) {
        Car car = ( ) ->{
            System.out.println("Hey i am in disp method of interface");
        };

        car.disp();
    }
}
```

# Question 2 : Can you pass lambda expressions to a methods ? When ?
Answer :- Yes we can pass lambda expressions to a method as argument if it is expecting any functional interface.
```java
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (int a, int b) -> a - b;

        int result1 = operateBinary(10, 5, addition);
        int result2 = operateBinary(10, 5, subtraction);

        System.out.println("Result of addition: " + result1); 
        System.out.println("Result of subtraction: " + result2);
    }

    public static int operateBinary(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}

```

# Question 3 : What is the Functional interface in java 8 ?
Answer :- Any interface that has only one abstract method is called functional interface.
```java
interface Students{
    public void greetThem();
}
```

# Question 4 : Why do we use Lambda Expression in java ?
Answer :- Lambda Expressions are provided so that we can direcly give the implementation of the method of the functional interface. It is mostly used when we have to use the interface only once.

```java
interface Car{
    public void disp();
}

public class  Try{
    public static void main(String[] args) {
        Car car = ( ) ->{
            System.out.println("Hey i am in disp method of interface");
        };

        car.disp();
    }
}
```

# Question 5 : Is it mandatory for a lambda expression to have parameters ?
Answer :- No it is not mandatory at all. in the above example i used a lambda expression which don't have any parameters .