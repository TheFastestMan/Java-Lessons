package beginning.newFieleWritinf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    File fl = new File("file");
    PrintWriter pw = new PrintWriter(fl);
    pw.println("Pussy power");
    pw.println("Pussy power");
    pw.println("Pussy power");
    pw.close();


    }
}
