package Filehandling;
import java.io.*;
public class BufferedWriter1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("src/Filehandling/Demo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Jai shree ram");
            bw.newLine();
            bw.write(65);
            bw.newLine();
            char ch[]={'p','w','s','k','i','l','l','s'};
            bw.write(ch);
            bw.flush();
            bw.close(); // automatically closes fw
        } 
        catch (IOException e) {
            System.out.println("Error");
        }
        
    }
}
