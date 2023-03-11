package InnerClass;

public class StaticInnerClass {
    public static void main(String[] args) {
       Car1 obj =new Car1();
       Car1.Engine obj2 =new  Car1.Engine(); // method 1
       obj2.disp2();

        // Car1.Engine obj1 = new Car1().new Engine(); // method 2 here Car1 object is anonymous
    }
}


class Car1{
    void disp(){
        System.out.println("In Car1 outer class.");
    }
    static class Engine{
        void disp2(){
            System.out.println("in Car1 inner class");
        }
    }
}