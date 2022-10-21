package mainCurseProf.lesson4BasicIOandNIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream ips = new FileInputStream("D:");
            System.out.println("File is opening");
        } catch (FileNotFoundException e) {
            System.err.println("Cannot open!");
            e.printStackTrace();
        }
    }
}
