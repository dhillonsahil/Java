package Oops;
public class Encapsulation1{
    public static void main(String[] args) {
        Student11 sahil = new Student11();
        sahil.setName("sahil");
        sahil.setRollNo(30);
        System.out.println(sahil.getName() + " "+ sahil.getRollNo());
    }
}
class Student11{
    private String name;
    private int rollNo;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    
}