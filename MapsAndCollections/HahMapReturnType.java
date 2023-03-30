package MapsAndCollections;

import java.util.*;
public class HahMapReturnType {
    public static void main(String[] args){
        HashMap hem = new HashMap();
        hem.put(30,"sahil");
        hem.put(3,"ankit");
        HashMap hem1= new HashMap();
        hem1.putAll(hem); 
        
        Set sp =  hem.keySet();   // .keySet() returns set
        Collection cr = hem.values(); // .values() returns Collection
        
        Iterator itr =sp.iterator();
        Iterator itr1 =cr.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }
}
