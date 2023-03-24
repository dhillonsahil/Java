package LearnCollection;

import java.util.*;
import java.util.concurrent.*;

public class Failfast_Failsafe{
    public static void main(String[] args) {
        ArrayList alr = new ArrayList<>();
        alr.add(10);
        alr.add(20);
        alr.add("SAHIL");

        // Iterator itr = alr.iterator();
        // while(itr.hasNext()){
        //     itr.next();
        //     alr.add(5);  // will throw an exception , can't modify 
        // }

        CopyOnWriteArrayList  alr2= new CopyOnWriteArrayList<>();
        alr2.add(4);
        alr2.add(9);
        Iterator itr1 = alr2.iterator();
        while(itr1.hasNext()){
            itr1.next();
            alr2.add(5);  // will not throw an exception , can't modify , prorgam will not fail
        }
    }
}