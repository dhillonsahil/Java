package InnerClass;

public class MemberInnerClass {
    public static void main(String[] args) {
       Car1 obj =new Car1();
       Car1.Engine obj2 = obj.new Engine(); // method 1
       obj2.disp2();

        // Car.Engine obj1 = new Car().new Engine(); // method 2 here car object is anonymous
    }
}


class Car1{
    void disp(){
        System.out.println("In car outer class.");
    }
    class Engine{
        void disp2(){
            System.out.println("in car inner class");
        }
    }
}