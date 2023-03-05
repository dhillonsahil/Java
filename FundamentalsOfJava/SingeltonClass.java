package FundamentalsOfJava;

public class SingeltonClass {
    public static void main(String[] args) {
        Singelton s = Singelton.getInstance();
    }
}

class Singelton{
    private  static Singelton instance;
    private Singelton(){};
    public static Singelton getInstance(){
        if(instance==null){
            instance = new Singelton();
        }
        return instance;
    }
}