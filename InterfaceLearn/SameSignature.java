package InterfaceLearn;

public class SameSignature{
    public static void main(String[] args) {
        A a= new A();
        a.sunm();
    }
}

class A implements sum,nSum{
   public void sunm(){
    System.out.println("hey");
    }
}

interface sum{
    void sunm();
}
interface nSum{
    void sunm();
}