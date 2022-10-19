package beginning.serializeable3;

import java.io.*;

public class Read {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people3.bin"))){
            Person person1 =(Person) ois.readObject();
            Person person2 =(Person) ois.readObject();
            System.out.println(person1);
            System.out.println(person2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
