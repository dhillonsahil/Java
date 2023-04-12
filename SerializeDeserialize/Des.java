package SerializeDeserialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.*;

public class Des {
public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("src/SerializeDeserialize/File.txt");
    BufferedInputStream bis = new BufferedInputStream(fis);
    ObjectInputStream ois = new ObjectInputStream(bis);
    Cricketer cr = (Cricketer)ois.readObject();
    // System.out.println(cr);
    cr.disp();
    ois.close();
    System.out.println("Done");
}
}
class Cricketer implements Serializable{
    private String name;
    private int age;
    private int run;
    public Cricketer(String name, int age, int run){
        this.name=name;
        this.age=age;
        this.run=run;
    }
    public void disp(){
        System.out.println(name + " "+ age + " "+run);
    }
}