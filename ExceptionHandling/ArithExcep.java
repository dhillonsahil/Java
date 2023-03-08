package ExceptionHandling;

public class ArithExcep{
    public static void main(String[] args) {
        int num =6;
        int num2 = 0;
        int result =0;
        try{
            result = num/num2;
        }catch(ArithmeticException e){
            System.out.println("Can't divide by Zero");
        }
        System.out.println(result);
        System.out.println("Bye" );
    }
}