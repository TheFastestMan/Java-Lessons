package beginning.silirisation;

import java.io.*;
import java.util.Arrays;

public class ReadPerson {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){
            Person person = (Person)ois.readObject();
            System.out.println(person);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
