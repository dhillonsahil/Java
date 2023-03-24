package LearnCollection;

import java.util.*;
public class Launch_AD1 {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(10);
        ad1.add(2);
        // ad1.add(2,"PW") not possible
        ad1.add(2);
        System.out.println(ad1);
        
        // 
        
        ad1.offer(50);
        ad1.offerLast(70);
        ad1.offerFirst(40);
        System.out.println(ad1);
    }
}


