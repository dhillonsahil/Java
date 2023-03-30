package MapsAndCollections;
import java.util.*;

class Student{
    private String name;
    private int age;
    private String city;
    Student(String name,int age, String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }


    // overriding to string for student if we don't over ride this it will give object hash code
    public String toString(){
        return name + " " +age + " "+ city; 
    }
}

public class OverridingToString {
    public static void main(String[] args) {
        Map map = new HashMap();
        Student st1 = new Student("sahil",20,"Hisar");
        Student st2 = new Student("Mohit",18,"Barwala");
        map.put(1,st1);
        map.put(2,st2);
        System.out.println(map);

        Set st = map.entrySet();
        Iterator itr = st.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }
    }
}
