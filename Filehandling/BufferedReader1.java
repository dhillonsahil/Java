package Filehandling;

import java.io.*;

public class BufferedReader1 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/Filehandling/Demo.txt");
        BufferedReader br = new BufferedReader(fr);
       System.out.println(br.readLine());
       System.out.println((char)br.read());
       char ch[] = new char[100];
       br.read(ch);
       System.out.println(ch);


        // BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    }
}
