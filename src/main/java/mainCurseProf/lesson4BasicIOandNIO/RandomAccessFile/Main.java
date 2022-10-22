package mainCurseProf.lesson4BasicIOandNIO.RandomAccessFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("C:\\Users\\79376\\IdeaProjects\\Java-Lessons\\src\\main\\java\\mainCurseProf\\lesson4BasicIOandNIO/Main.java","rw");
            raf.write(new byte[]  {0,1,2,3,4,5,6,7,8,9});
            raf.seek(5);
            raf.write(new byte[]{33,44,55});
            raf.seek(0);
            byte[] arr = new byte[10];
            int n = raf.read(arr,0,10);
            System.out.println(Arrays.toString(arr));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
