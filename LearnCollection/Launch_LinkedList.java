package LearnCollection;

import java.util.*;

public class Launch_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Hello");
        ll.add("Hii");
        ll.add("Bye");
        ll.add("apple");

        ListIterator<String> itr = ll.listIterator();
        
        while(itr.hasNext()){
            String element = itr.next();
            if(element.equals("banana")){
                itr.set("apple");
            }
        }
    }
}
