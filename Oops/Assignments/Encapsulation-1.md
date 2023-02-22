# Question 1 What is Encapsulation in Java ? Why it is called Data hiding?
 Encapsulation is Binding the Variables and corresponding Methods in a single unit.
Need :-
Data should not be exposed to the outside world(another classes) directly and when we need to provide controlled access Encapsulation is used.

___
# Question 2 :- What is the important features of Encapsulation ?
1. Security
1. Flexibility
1. Easy Maintainability

___
# Question 3 :- What are getters and Setters in Java ?
Setters are used to set the value or initialize a private variable in a class and Getters are used to retrieve / fetch the value of that program.
```java
public class LearnThis{
    public static void main(String[] args) {
        Employee rahul = new Employee();
        rahul.setName("Rahul");
        rahul.setEmployeeId(1049);
        rahul.setSalary(115000);
        System.out.println(rahul.getName());
        System.out.println(rahul.getSalary());
        System.out.println(rahul.getEmployeeId());
    }
}
class Employee{
    private int salary;
    private int employeeId;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;
}
```
___
# Question 4 :- What is the use of this keyword explain with an example ?
this keyword passes the reference of the current object to the class so we can initialize the value of the instance variables if we have same local variable name and instance variable name.

___
# Question 5 :- What is the advantage of Encapsulation ?
1. Provides security
1. Simplifies the maintenance of the application.
1. Easy Enhancement 

___
# Question 6 :- How to achieve Encapsulation in Java ? Explain with an example.
By using the private keyword we can enable data hiding in the application.
As in the below example we used the private so the variables can’t be directly accessed outside the class.
```java
public class LearnThis{
    public static void main(String[] args) {
        Employee rahul = new Employee();
        rahul.setName("Rahul");
        rahul.setEmployeeId(1049);
        rahul.setSalary(115000);
        System.out.println(rahul.getName());
        System.out.println(rahul.getSalary());
        System.out.println(rahul.getEmployeeId());
        
    }
}
class Employee{
    private int salary;
    private int employeeId;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name
            }
    private String name;
}
