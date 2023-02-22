package Oops;

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

public class PolyMorph1{
    public static void main(String[] args) {
        Aeroplane cp = new CargoPlane();
        cp.takeoff();      // not actual polymorphism because code size needs to be reduced 
        cp.fly();
        cp = new PassengerPlane();
        cp.takeoff();
        cp.fly();

    }
}