package Oops;

class A{

    static void m1(){
   
    System.out.println("m1-A");
   
    }
   
   }
   
   class B extends A{
   
    static void m1(){
   
    System.out.println("m1-B");
   
    }
   
   }
   
   public class ParentSaveChildRefer{
   
    public static void main(String args[]){
   
    A a=new B();
   
    a.m1();
   
    }
   
   }