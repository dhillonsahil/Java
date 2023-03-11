package InnerClass;

public class StaticInnerClass {
    public static void main(String[] args) {
       Car11 obj =new Car11();
       Car11.Engine obj2 =new  Car11.Engine(); // method 1
       obj2.disp2();

        // Car11.Engine obj1 = new Car11().new Engine(); // method 2 here Car11 object is anonymous
    }
}


class Car11{
    void disp(){
        System.out.println("In Car11 outer class.");
    }
    static class Engine{
        void disp2(){
            System.out.println("in Car11 inner class");
        }
    }
}