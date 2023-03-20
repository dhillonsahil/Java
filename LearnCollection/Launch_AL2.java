package LearnCollection;


import java.util.*;

public class Launch_AL2 {
    public static void main(String[] args) {
        ArrayList al =new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        int index =  al.indexOf(200);
       System.out.println(index);
       System.out.println(al.size());
       
       al.ensureCapacity(10); // allocates 10 minimum capacity ( we are using only 3 so 7 are going waste)
       al.trimToSize(); // remove the empty space so makes it 3
       System.out.println(al.size());
    }
}
