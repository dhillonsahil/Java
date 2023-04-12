package SerializeDeserialize;
import java.io.*;

public class Ser {
    public static void main(String[] args) throws Exception {
        // Serialize
        
        // Cricketer cri = new Cricketer("Virat", 44, 34000);
        // FileOutputStream fos = new FileOutputStream("src/SerializeDeserialize/File.txt");
        // BufferedOutputStream bos = new BufferedOutputStream(fos);  // to make more efficient
        // ObjectOutputStream oos = new ObjectOutputStream(bos);
        // oos.writeObject(cri);
        // cri.disp();
        // oos.flush();
        // oos.close();

        // Deserialize
        FileInputStream fis = new FileInputStream("src/SerializeDeserialize/File.txt");
        BufferedInputStream bis= new BufferedInputStream(fis);
        ObjectInputStream ois= new ObjectInputStream(bis);
        // ObjectInputStream oiis = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/SerializeDeserialize/File.txt")));
        Cricketer cri=(Cricketer)ois.readObject();
        cri.disp();
        ois.close();
        System.out.println("Deserialized Successfully");
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