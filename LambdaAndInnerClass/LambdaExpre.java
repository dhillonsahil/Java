package LambdaAndInnerClass;

import java.util.*;

public class LambdaExpre {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n != 0) {
            int condition = scan.nextInt();
            int number = scan.nextInt();
            if (condition == 1) {
                Odd odd = Checknumber -> {
                    if (Checknumber % 2 != 0) {
                        return true;
                    } else {
                        return false;
                    }
                };
                odd.isODD(number);
            } else if (condition == 2) {
                Prime prime = CheckNumber -> {
                    boolean isPrime = true;
                    for (int i = 2; i <= Math.sqrt(CheckNumber); i++) {
                        if (CheckNumber % i == 0) {
                            isPrime = false;
                        }
                    }
                    if (isPrime) {
                        return true;
                    }else{
                        return false;
                    }
                };
                prime.isPrime(number);
            } else if (condition == 3) {
                Palindrome palindrome = CheckNumber -> {
                    int reversedNum = 0, remainder, originalNum = CheckNumber;
                    while (CheckNumber != 0) {
                        remainder = CheckNumber % 10;
                        reversedNum = reversedNum * 10 + remainder;
                        CheckNumber /= 10;
                    }

                    if (originalNum == reversedNum) {
                        return true;
                    }else{
                        return false;
                    }
                };
                palindrome.isPalindrome(number);
            }
            n--;
        }
scan.close();
    }
}

interface Odd {
    boolean isODD(int number);
}

interface Prime {
    boolean isPrime(int number);
}

interface Palindrome {
    boolean isPalindrome(int number);
}