package mainCurseProf.lesson4BasicIOandNIO.IO;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        try (OutputStream os = new FileOutputStream("test.txt")) {
            byte[] bWrite = {95, 22, 34, 78, 46, 54};
            for (int i = 0; i < bWrite.length; i++) {
                os.write(bWrite[i]);

            }

            os.flush();

            is = new FileInputStream("test.txt");
            int size = is.available();
            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read());
            }


        } catch (IOException e) {
            System.out.println("Exception");
        }
        if (is!=null){is.close();
        }
    }
}