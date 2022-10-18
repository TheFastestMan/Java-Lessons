package beginning.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ScannerException {
        Scanner s1 = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(s1.nextLine());
            if (x!=0){
                    throw new ScannerException("Something wrong");
            }
        }
    }
}
