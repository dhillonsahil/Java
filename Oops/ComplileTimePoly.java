package Oops;

public class ComplileTimePoly {
    public static void main(String[] args) {
        Sum s = new Sum();
        s.add(1, 2);
        s.add(3 , 2 , 5);
    }
}

class Sum{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a,int b , int c){
        System.out.println(a+b+c);
    }
}