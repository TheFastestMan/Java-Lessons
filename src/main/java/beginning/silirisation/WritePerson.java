package beginning.silirisation;

import javax.security.auth.login.AccountLockedException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritePerson {
    public static void main(String[] args) {
        Person person = new Person(12,"Ivan");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){
            oos.writeObject(person);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
