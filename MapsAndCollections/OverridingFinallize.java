package MapsAndCollections;
import java.util.*;

class Employee{
    private String name;
    private int Employee_id;
    Employee(String name , int id){
        this.name=name;
        this.Employee_id=id;
    }
    
    public String tosString(){
        return Employee_id+ "";
    }
    
    @Override
    public void finalize(){
        System.out.println("Garbage collector modified by Sahil");
    }
}
public class OverridingFinallize {
    public static void main(String[] args) {
        Employee e = new Employee("sahil", 30);
        // HashMap hm = new HashMap();
        WeakHashMap hm = new WeakHashMap();
        System.out.println(hm);
        e =null;
        System.gc();
        hm.put(e, "Hyder");
        System.out.println(hm);
    }
}