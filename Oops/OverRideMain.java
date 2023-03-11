package Oops;
public class OverRideMain {
    public static void main(String[] args) {
        
    }
}


class Parent{
    int x = 100;
    {
        methodOne();
        System.out.println("Parent class Instance block");
    }
    Parent(){
        System.out.println("Parent class const");
    }
    void methodOne(){
        System.out.println(j);
    }
    int j=200;
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println("Parent class main()");
    }
}

class Child1 extends Parent{
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