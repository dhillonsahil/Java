package MapsAndCollections;

import java.util.*;

public class IteratingMaps {
    public static void main(String[] args) {
        
        // type 1
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Mercury");
        map.put(2, "Venus");
        map.put(3, "Earth");
        map.put(4, "Mars");
        
        System.out.println(map.get(4));  // Iterating using get for single 


        // type 2  :- access keys

        Set st = map.keySet();  // saving in set because key()
        // Iterator itr = map.iterator();    // no iterator for Map so its wrong
        Iterator itr = st.iterator();
        while(itr.hasNext()){
            // System.out.println(map.get(itr.next()));   // works fine
            System.out.println(itr.next());
        }

        // type 3 :- using value
        Collection ct = map.values();
        Iterator itr1 = ct.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }


        // Type 4 :- entry
        Set st2= map.entrySet();
        Iterator itr3 = st2.iterator();
        while(itr3.hasNext()){
            Map.Entry etr = (Map.Entry)itr3.next();
            System.out.println(etr.getKey() + " : "+ etr.getValue());
        }
    }
}
