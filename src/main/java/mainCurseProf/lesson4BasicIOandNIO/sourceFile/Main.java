package mainCurseProf.lesson4BasicIOandNIO.sourceFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        File sourceFile = new File("C:\\Users\\79376\\IdeaProjects\\Java-Lessons\\src/targetFile.txt");
        File targetFile = new File("C:\\Users\\79376\\IdeaProjects\\Java-Lessons\\src\\main\\java\\mainCurseProf\\lesson4BasicIOandNIO/targetFile2.txt");

        try {
            Files.move(sourceFile.toPath(), targetFile.toPath());
            //Files.copy(sourceFile.toPath(), targetFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
