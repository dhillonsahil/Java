package StreamAnnotations;

import java.lang.annotation.*;
import java.util.*;
import java.util.stream.*;

public class StreamLearn{
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4);
        // list.forEach(n->System.out.println(n));
        // Week.MONDAY.setMarks(5);
        // System.out.println(Week.MONDAY.marks);        
        // Week.TUESDAY.setMarks(3);
        // System.out.println(Week.TUESDAY.marks);        
        // System.out.println(Week.MONDAY.marks);        

        Stream str = list.stream();
        List<Integer> li =  list.stream().map(n->n*n).collect(Collectors.toList());
        li.forEach(n->System.out.println(n));

        Peo pe = new Peo();
        Class cl=pe.getClass();
        Annotation a=cl.getAnnotation(Peo.class);
        People p = (People)a;
        System.out.println(p.name());

        

    }
}

enum Week{
    MONDAY,TUESDAY,WEDNESDAY;
    int marks;
    public void setMarks(int marks){
        this.marks=marks;
    }
}

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface People{

    String name() default "SAHIL";
}

@People
class Peo{

}