package mainCurseProf.lesson4BasicIOandNIO.FileReder;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\79376\\IdeaProjects\\Java-Lessons\\src\\main\\java\\mainCurseProf\\lesson4BasicIOandNIO\\FileReder/example.txt");
        BufferedReader br = new BufferedReader(new FileReader(f1));

        String str;
        while ((str = br.readLine())!=null){
            System.out.println(str);
        }
        br.close();

        PrintWriter pw = new PrintWriter(new FileWriter(f1,true));
        pw.println("Good luck");
        pw.flush();
        pw.close();



    }
}
