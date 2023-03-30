package MapsAndCollections;

import java.util.*;
public class ReversingArrayWithMap {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        int[] arr = {5,3,7,1,9,6,4,2};
        int i = 1;
        for(int a: arr){
            ht.put(arr[i-1],arr[i-1]);
            i++;
        }
        Collection ll=ht.values();
        i = 0;

        System.out.println(ll);        // prints reverse sorted
        
        Iterator itr =ll.iterator();
        while(itr.hasNext()){
            arr[i]=(Integer)itr.next();
            i++;
        }
        for (int a : arr) {
            System.out.print(a + ",");
        }
    }
}
