package InterfaceLearn;

public class ExtendImplement {
    public static void main(String[] args) {
        Student s= new Student();
        System.out.println(s.collegename);
        s.pincode=125001;
        System.out.println(s.pincode);
    }
}

class Student extends Address implements college{
    void disp(){
        System.out.println("Hello");
    }
}
interface college{
    public String collegename="CRM JAT COLLEGE";
}
class Address{
    String city;
    String state;
    int pincode;

}