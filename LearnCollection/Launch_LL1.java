package LearnCollection;
import java.util.*;

public class Launch_LL1 {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.add(5);
        ll1.add(5);
        System.out.println(ll1);

        LinkedList ll2 = new LinkedList();
        ll2.add("SAHIL");
        ll2.add("DHILLON");

        // ll1.add(ll2);
        ll1.addAll(ll2);
        // ll1.addFirst(12);
        ll1.addLast(45);
        System.out.println(ll1);
        
        System.out.println(ll1.peek()); // returns 1st object of collection (collection ll1 is still same)
        System.out.println(ll1.poll()); // returns 1st object of collection (and object is removed from the Collection ll1)
        System.out.println(ll1);
        // System.out.println(ll1);
    }
}
