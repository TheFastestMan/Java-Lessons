package mainCurseProf.lesson4BasicIOandNIO.buffered;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\79376\\IdeaProjects\\Java-Lessons\\src\\main\\java\\mainCurseProf\\lesson4BasicIOandNIO/Main.java"),"UTF-8"));
            BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Main.java"),"UTF-8"));
            int c;
            while ((c = bReader.read())!=-1){
                System.out.println((char) c);
            }
            bWriter.flush();
            System.out.println("The jobs finished.");
        } catch (Exception e) {
            System.out.print(e+" ");;
        }
    }
}
