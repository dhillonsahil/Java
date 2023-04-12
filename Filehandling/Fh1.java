package Filehandling;

import java.io.*;

public class Fh1 {
    public static void main(String[] args) {
        File dir = new File("JaiShreeRam.txt");
        dir.mkdir();
        dir.delete();
    }
}
