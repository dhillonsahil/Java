package Oops;

import java.util.Scanner;

public class ComplexNumbersQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter real part of Complex number 1");
        int r1=scan.nextInt();
        System.out.println("Enter imaginary part of Complex number 1");
        int i1=scan.nextInt();
        System.out.println("Enter real part of Complex number 1");
        int r2=scan.nextInt();
        System.out.println("Enter imaginary part of Complex number 2");
        int i2=scan.nextInt();
        ComplexNumber a = new ComplexNumber(r1, i1);
        ComplexNumber b = new ComplexNumber(r2, i2);
        ComplexNumber c = ComplexNumber.Add(a,b);
        ComplexNumber d = ComplexNumber.Product(a, b);
        ComplexNumber e = ComplexNumber.Subtract(a, b);
        c.PrintComplex();
        d.PrintComplex();
        e.PrintComplex();
        scan.close();
    }
}

class ComplexNumber{
    int real;
    int imag;
    ComplexNumber(int r, int i){
        this.real=r;
        this.imag=i;
    }
    public static ComplexNumber Add(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber((a.real+b.real),(a.imag+b.imag));
    }
    public static ComplexNumber Subtract(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber((a.real-b.real),(a.imag-b.imag));
    }
    public static ComplexNumber Product(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber((a.real*b.real),(a.imag*b.imag));
    }
    public void PrintComplex(){
        if(real==0 && imag!=0){
            System.out.println(imag+"i");
        }else if(real!=0 && imag==0){
            System.out.println(real);
        }else{
            System.out.println(real + "+" + imag+"i");
        }
    }
}