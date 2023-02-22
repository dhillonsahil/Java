package Oops;
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