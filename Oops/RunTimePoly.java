package Oops;

public class RunTimePoly {
    public static void main(String[] args) {
        vehicle v= new vehicle();
        vehicle c= new car();
        vehicle b= new bike();
        Runtime r= new Runtime();
        r.disp(b);
        r.disp(v);
        r.disp(c);
        

    }
}

class Runtime{
    void disp(vehicle obj){
        obj.disp();
    }
}

class vehicle{
    void disp(){
        System.out.println("i am vehicle class");
    }
}
class bike extends vehicle{
    void disp(){
        System.out.println("i am bike class");
    }
}
class car extends vehicle{
    void disp(){
        System.out.println("i amm Car class");
    }
}