package Oops;
public class Abstraction {
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