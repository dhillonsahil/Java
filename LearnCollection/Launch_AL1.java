package LearnCollection;

import java.util.*;

public class Launch_AL1{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        // stores arrays of object

        // all information is stored as object
        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println(al.contains("Sahil"));
        System.out.println(al);

        System.out.println("*****************************************");
        ArrayList al2 = new ArrayList();
        al2.add("j");
        al2.add(1);
        al2.add(1.1);
        System.out.println(al2);

        System.out.println("*****************************************");
        System.out.println("After adding al2 in al ");
        al.addAll(al2);
        System.out.println(al);
        
        System.out.println("*****************************************");
        ArrayList al3 = new ArrayList();
        al3.add("PW skills");

        al.addAll(2,al3);   // add Collection to a specific Index
        // index based insertion is Not preferred if we want to add like this use Linked List
        al.add(3,"SAHIL");   // add string to a specific index
        System.out.println(al);
    }
}