package LearnGenrics;

import java.util.*;
public class ClassGenrics {
    public static void main(String[] args) {
        Gen<String> gn = new Gen<String>("Sahil");
        gn.disp();
       System.out.println( gn.getObj());
    }
}

class Gen<T>{
    T obj;
    Gen(T obj){
        this.obj=obj;
    }
    public T getObj(){
        return obj;
    }
    public void disp(){
        System.out.println("The class genrics is "+ obj.getClass().getName());
    }
}