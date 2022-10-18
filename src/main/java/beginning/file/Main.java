package beginning.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator+ "C:" +separator+"Users"+separator+"79376"+separator+"OneDrive"+separator+"Рабочий стол"+separator+"test.txt";

        File file = new File(path);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
