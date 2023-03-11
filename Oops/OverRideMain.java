package Oops;
public class OverRideMain {
    public static void main(String[] args) {
        
    }
}


class Parent1{
    int x = 100;
    {
        methodOne();
        System.out.println("Parent class Instance block");
    }
    Parent1(){
        System.out.println("Parent class const");
    }
    void methodOne(){
        System.out.println(j);
    }
    int j=200;
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        System.out.println("Parent class main()");
    }
}

class Child1 extends Parent1{
    int y = 30;
    {
        methodTwo();
        System.out.println("Child class Instance block");
    }
    Child1(){
        System.out.println("Child class Constructor");
    }
    void methodTwo(){
        System.out.println(e);
    }
    int e = 20;
    public static void main(String[] args) {
        Child1 c = new Child1();
        System.out.println("Child class Main()");
    }

}