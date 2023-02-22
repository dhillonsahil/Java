package Filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewTry {
    public static void main(String[] args) throws FileNotFoundException {
        String users[][]= {{"sahil","1492"},{"mohit" , "9350"}};
        File file= new File("users.txt");
        try {
            FileWriter writer = new FileWriter(file);
            for(String user[]:users){
                writer.write(user[0] + "," + user[1] + "\n");
            }
            writer.close();
            Scanner scan = new Scanner(file);
                while(scan.hasNextLine()){
                    String line = scan.nextLine();
                    String user[] = line.split(",");
                    System.out.println("username : "+ user[0]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
