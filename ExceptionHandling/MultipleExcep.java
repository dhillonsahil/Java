package ExceptionHandling;

public class MultipleExcep {
    public static void main(String[] args) {
        int num1 =6;
        int num2= 1;
        int result =0;
        int nums[]={1,2,3,4};
        try{
            result = num1/num2;
            System.out.println(nums[5]);
        }catch(ArithmeticException e){
            System.out.println("Can't divide by zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You are trying to access a value which is not present");
        }
        System.out.println(result);
    }
}
