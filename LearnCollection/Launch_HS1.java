package LearnCollection;

import java.util.*;


public class Launch_HS1 {
    public static void main(String[] args) {
        HashSet hs1= new HashSet();
        hs1.add(10);
        hs1.add(20);
        hs1.add(5);
        hs1.add(5000);
        System.out.println(hs1.contains(51));
        Iterator itr = hs1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ArrayList alt = new ArrayList<>();
        ListIterator litr = alt.listIterator();
        ListIterator litr1 = alt.listIterator(5);
        System.out.println(litr.hasPrevious());;

    }
}
