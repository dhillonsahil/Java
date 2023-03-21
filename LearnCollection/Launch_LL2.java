package LearnCollection;

import java.util.*;

public class Launch_LL2 {
    public static void main(String[] args) {
        // List ll1 = new LinkedList();
        // ll1.add(10);
        // ll1.add(20);
        // ll1.add(30);
        // ((LinkedList)ll1).addFirst(35);
        // System.out.println(ll1);

        LinkedList ll2 = new LinkedList();
        ll2.add(10);
        ll2.add(20);
        ll2.add(30);
        System.out.println(ll2.get(1));
        System.out.println(ll2.indexOf(30));
        System.out.println(ll2.lastIndexOf(20));
        System.out.println(ll2.getFirst());
        System.out.println(ll2.getLast());
        System.out.println(ll2.get(0));
        
        ll2.push(12);  // ast the begining
        System.out.println(ll2);
        System.out.println(ll2.pop());
        System.out.println(ll2);
;    }
}
