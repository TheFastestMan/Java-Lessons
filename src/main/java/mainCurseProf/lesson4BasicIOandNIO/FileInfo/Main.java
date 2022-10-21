package mainCurseProf.lesson4BasicIOandNIO.FileInfo;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {
       try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out,"UTF-8"),true)){
           File f = new File("C:\\Users\\79376\\IdeaProjects\\Java-Lessons\\src\\main\\java\\mainCurseProf\\lesson4BasicIOandNIO\\FileInfo/Main.java");
           pw.println();
           pw.println("Файл\""+f.getName()+"\""+(f.exists()?"": "не")+"существует");
           pw.println("Вы"+(f.canRead() ?"":"не")+"не можете читать файл");
           pw.println("Вы"+(f.canWrite() ?"":"не")+"не можете записать в файл");
           pw.println("Длинна файла" + f.length() +"б");
           pw.println();
           File d = new File("C:\\Users\\79376\\IdeaProjects\\Java-Lessons\\src");
           pw.println("Содержимое катоалога: ");
           if (d.exists()&&d.isDirectory()){
               String[] s = d.list();
               for (int i = 0; i < s.length; i++) {
                   pw.println(s[i]);
               }

           }

       } catch (UnsupportedEncodingException e) {
           e.printStackTrace();
       }
    }
}
