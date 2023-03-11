package InterfaceLearn;

public class SameSignature{
    public static void main(String[] args) {
        A1 a= new A1();
        a.sunm();
    }
}

class A1 implements sum,nSum{
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