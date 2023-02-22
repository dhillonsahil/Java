package Oops;
class Address{
    int Pincode;
    String State;
}

// we don't extended employee to use the pincode and state of Address class
// so We created an object of address to use them
// this is called aggreation
// kisi class ke andar kisi class ka reference present ho

// we can't access the address directly by the object of Employee example :- sahil.pincode
// we have to pass as sahil.address.pincode


class Employee{
    String name;
    int Emplyeeid;
    Address address=new Address();
    Employee(String name ,int Emplyeeid , int Pincode, String State){
        this.Emplyeeid=Emplyeeid;
        this.name=name;
        this.address.Pincode=Pincode;
        this.address.State=State;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Employee sahil = new Employee("SAHIL", 30, 125112, "Haryana");
        System.out.println(sahil.name);
        System.out.println(sahil.Emplyeeid);
        System.out.println(sahil.address.Pincode);
        System.out.println(sahil.address.State);
    }
}
// kisi class ke andar kisi class ka reference / object present ho
