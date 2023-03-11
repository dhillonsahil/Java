package Oops;

public class PolyMorph2 {
    public static void main(String[] args) {
        Airport ref = new Airport();
        ref.display(new CargoPlane1());             // run time polymorphism same method for both class
        ref.display(new PassengerPlane1());
    }
}

class Airport{
    void display(Aeroplane1 aero){
        aero.takeoff();
        aero.fly();
        System.out.println("----------------------------------------");
    }
}

class Aeroplane1{
    void takeoff(){
        System.out.println("Aeroplane1 is taking off");
    }
    void fly(){
        System.out.println("Aeroplane1 is flying");
    }
}
class CargoPlane1 extends Aeroplane1{
void takeoff(){
        System.out.println(" CargoPlane1 is taking off");
    }
    void fly(){
        System.out.println(" CargoPlane1 is flying");
    }
}

class PassengerPlane1 extends Aeroplane1{
    void takeoff(){
        System.out.println(" Passenger Plane is taking off");
    }
    void fly(){
        System.out.println(" Passenger Plane is flying");
    }
}