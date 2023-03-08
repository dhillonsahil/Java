package ExceptionHandling;

public class throwsExcept {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        try{
            d.a();
        }catch(Exception e){
            System.out.println("OOps an error came the error is" + e);
        }
    }
    
}
class Demo1{
    public void a() throws Exception{
        b();
    }
    public void b() throws Exception{
        int num1=2;
        int num2=0;
        int result = num1/num2;
        System.out.println(result);
    }
}
