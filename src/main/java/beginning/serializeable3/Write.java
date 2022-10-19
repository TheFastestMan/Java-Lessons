package beginning.serializeable3;

import java.io.*;

public class Write {
    public static void main(String[] args) {
        Person person1 = new Person("Mike" , 12);
        Person person2 = new Person("Nik" , 13);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people3.bin"))){
            oos.writeObject(person1);
            oos.writeObject(person2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
