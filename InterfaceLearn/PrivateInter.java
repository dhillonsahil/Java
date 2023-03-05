package InterfaceLearn;

public class PrivateInter{
    public static void main(String[] args) {
        A a = new A();
        // a.hello();
        AB.trying();
        
    }
}
class A implements AB{
    

}
interface AB{
    // private int hello;
    private static void name() {
        System.out.println("AB private method");
    }
    default void hello(){
        name();
    }
    static void trying(){
        name();
        System.out.println("just trying");
    }
}