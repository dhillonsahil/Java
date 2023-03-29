package LearnCollection;

import java.util.*;


public class Launch_HS1 {
    public static void main(String[] args) {
        HashSet<Integer> hs1= new HashSet<>();
        HashSet<Integer> hs2= new HashSet<>();
        hs2.add(3);
        hs2.add(5);
        hs2.add(7);
        hs1.add(10);
        hs1.add(20);
        hs1.add(5);
        hs1.add(5000);
        hs1.addAll(hs2);
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
