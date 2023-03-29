package LambdaAndInnerClass;

interface MathOperation {
    int operate(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (int a, int b) -> a - b;

        int result1 = operateBinary(10, 5, addition);
        int result2 = operateBinary(10, 5, subtraction);

        System.out.println("Result of addition: " + result1); 
        System.out.println("Result of subtraction: " + result2);
    }

    public static int operateBinary(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}