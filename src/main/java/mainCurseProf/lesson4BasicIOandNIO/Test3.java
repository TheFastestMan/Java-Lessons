package mainCurseProf.lesson4BasicIOandNIO;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dataOut.txt")));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("dataOut.txt")))){
            out.writeShort(1000);
            out.writeInt(100);
            out.writeLong(10L);
            out.writeUTF("Hello");
            out.flush();

            System.out.println(in.readShort());
            System.out.println(in.readInt());
            System.out.println(in.readLong());
            System.out.println(in.readUTF());

            System.out.println(out);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
