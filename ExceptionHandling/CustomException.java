
package ExceptionHandling;

public class CustomException {
    public static void main(String[] args) {
        int n1 =6;
        int n2 =-2;
        int result=0;
        try{
            if(n2<0){
                throw new MyException("n2 is smaller than 0");
            }
            result =n1/n2;
        }catch(ArithmeticException e){
            System.out.println("Can not divide by 0");
        }
        catch(Exception e){
            System.out.println("error is "+e);
        }
        System.out.println(result);
    }
}

class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}