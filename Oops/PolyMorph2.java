package Oops;

public class PolyMorph2 {
    public static void main(String[] args) {
        Airport ref = new Airport();
        ref.display(new CargoPlane());             // run time polymorphism same method for both class
        ref.display(new PassengerPlane());
    }
}

class Airport{
    void display(Aeroplane aero){
        aero.takeoff();
        aero.fly();
        System.out.println("----------------------------------------");
    }
}

class Aeroplane{
    void takeoff(){
        System.out.println("Aeroplane is taking off");
    }
    void fly(){
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane{
void takeoff(){
        System.out.println(" CargoPlane is taking off");
    }
    void fly(){
        System.out.println(" CargoPlane is flying");
    }
}

class PassengerPlane extends Aeroplane{
    void takeoff(){
        System.out.println(" Passenger Plane is taking off");
    }
    void fly(){
        System.out.println(" Passenger Plane is flying");
    }
}