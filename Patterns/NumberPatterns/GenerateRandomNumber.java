package Patterns.NumberPatterns;
public class GenerateRandomNumber{
    public static void main(String[] args) {
        double number = Math.random()*100;
        int random_number = (int)number;
        System.out.println("Random Number is : " + random_number);

    }
}