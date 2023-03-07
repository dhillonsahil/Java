// package InnerClass;

// public class UsingRecords {
    
// }
package InnerClass;
public class UsingRecords{
    public static void main(String[] args) {
    
            Person p = new Person("sahil", "dhillon");
        System.out.println(p.firstName () + " "+p.lastName ());
       
    }
}

record Person(String firstName, String lastName){};