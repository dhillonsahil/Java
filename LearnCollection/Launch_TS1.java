package LearnCollection;
import java.util.*;

public class Launch_TS1 {
    public static void main(String[] args) {
       TreeSet ts = new TreeSet(); 
       ts.add(10);
       ts.add(100);
       ts.add(20);
       ts.add(5);
       ts.add(9);
       ts.add(4);
       System.out.println(ts.higher(10));
       System.out.println(ts.ceiling(10));
       System.out.println(ts.floor(10));
    }
}
