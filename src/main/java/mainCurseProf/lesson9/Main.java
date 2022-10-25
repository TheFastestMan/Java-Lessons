package mainCurseProf.lesson9;

import java.io.*;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException {
        // Steps in Serialize
        // 1 Your Object class should implement Serializable interface
        // 2 add import java.io.Serializable;
        // 3 FileOutPutStream fos = new FileOutPutStream (file path)
        // 4 ObjectOutPutStream oos = new ObjectOutPutStream (fos);
        // 5 oos.writeObject(Object name)
        // 6 oos.close();, fos.close();
        User user = new User("UserLogin","UserPassword");



        FileOutputStream fos = new FileOutputStream("UserInfo.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
        oos.close();
        fos.close();

        System.out.println("File saved");


    }
}
