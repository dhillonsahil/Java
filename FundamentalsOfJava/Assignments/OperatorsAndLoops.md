# Question 1. What are conditional operators in Java ?
 Conditional Operators in Java are of three types Logical AND (&&) , Logical OR (||) and Logical Not (!).
* If both the condition are true logical / conditional and will return true and if one or both of them are false it will return false.
* If any one of them or both of them are true . logical or will return true , and if both of them are false it will return false.
* Logical not compliments the True of false. It converts true to false or false to true.

___
# Question 2. What are the type of operand based on number of operands ?
There are mainly two types of operators, the 1st one are which require two operands e.g. (2 +3) here 2 and 3 are operands.
And the second one are which require only one Operand (eg. a++). The increment and decrement operators and unary operators comes in it.

___
# Question 3.  What is the use of switch case in Java programming ?
Switch case in programming is used in such  a way that a expression or value is provided to the switch and there are a number of cases according to need in it. If the value of switch meets a specific case value like

```java
int age = 20;
   switch(age ) {
case 20: System.out.println(“You are 20”);  break ; 
case 21 : System.out.println(“you are 21”);  break;
}
```
Here age match with the case having value 20 and will print the value of case 20 and ends the condition

___
# Question 4. What are priority level of arithmetic operation in Java ?
In Java Priority / Precedence is as the following
1. ( ) :- parenthesis          
2. \* , /  , %                                    :-       from left to right
3. \+ , -                                             : -      from left to right

___
# Question 5. What are conditional statements and use of conditional statements in Java ?
Conditional statements in java are used in such a way that if we want a particular block of code to be executed only when it satisfies a condition.
There are two types of conditional statements in Java
1. If – else
2. Switch
___
# Question 6. What is the syntax of if else statement in Java ?
```java
if(condition){
                       // code or body
}
else{
                     // code 
}
```

___
# Question 7. What are the three type of iterative statements in Java ?
 The three types of Iterative statement in Java are :- 
1. While Loop
2. Do while Loop
3. For Loop

___
# Question 8. Write the Difference between for Loop and Do while Loop?
 in for loop we have a initializer , a condition  and a update (increment and decrement ). It will run if and only if the condition is True;
In do while Loop there is only A condition . we have to initialize a variable before using the loop and update (increment and decrement) it inside the body.
And the do while Loop Will execute At least once no matter the condition is true of false.

___
# Question 9 .  Write A program to print numbers from 1 to 10 ?
the program with file name PrintNumbers will be :-
```java
  public class PrintNumbers{
public static void main(String[] args){
for(int i=1;i<=10;i++){
System.out.println(i);          
}
} 
}
```
