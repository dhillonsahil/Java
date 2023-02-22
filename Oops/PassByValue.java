package Oops;
// public class PassByValue {
//     public static void main(String[] args) {
//         Student a = new Student("sahil");
//         System.out.println(a.name);
//         ChangeValue(a);
//         System.out.println(a.name);
//     }

//     static void ChangeValue(Student s){
//         s.name = "mohit";
//     }
// }

// class Student{
//     String name;

//     Student(String name){
//         this.name=name;
//     }
// }

public class PassByValue {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        System.out.println("Before calling changeValue() method, obj.value = " + obj.getValue());

        changeValue(obj);

        System.out.println("After calling changeValue() method, obj.value = " + obj.getValue());
    }

    public static void changeValue(MyClass myObj) {
        myObj.setValue(20);
    }
}

class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
