package mainCurseProf.lesson4BasicIOandNIO.IO_Sream;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bread = new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
            PrintWriter write = new PrintWriter(new OutputStreamWriter(System.out,"UTF-8"),true);
            String s = "Привет мир";
            System.out.println("System.out.puts:"+ s);
            write.println("PrintWriter puts: " + s);

            char c;
            System.out.println("Посимвольный вывод");
            while ((c = (char)bread.read())!='q'){
                write.println(c);
            }
            write.println("Построчный ввод");
            do {
                s = bread.readLine();
                write.println(s);
            }while (!s.equals("q"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
