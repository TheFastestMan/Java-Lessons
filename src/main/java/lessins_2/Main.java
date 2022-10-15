package lessins_2;

<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
=======
import javax.security.auth.login.AccountNotFoundException;
import javax.swing.*;
import java.util.EnumMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Animal, String> enumMap = new EnumMap<Animal, String>(Animal.class);

        enumMap.put(Animal.HORSE,"One");
        enumMap.put(Animal.SPIDER,"Two");
        enumMap.put(Animal.SCORPION,"Three");
        enumMap.put(Animal.FISH,"Four");

        System.out.println(enumMap);
>>>>>>> b667bfc (Initial commit)

    }
}
