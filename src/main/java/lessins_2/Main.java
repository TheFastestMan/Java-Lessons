package lessins_2;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

import static lessins_2.Animal.*;

public class Main {
    public static void main(String[] args) {
        Map<Animal, String> enumMap = new EnumMap<Animal, String>(Animal.class);

        enumMap.put(HORSE, null); // We can have a null as a value but cannot as a key
        enumMap.put(SPIDER, "Two");
        enumMap.put(SCORPION, "Three");
        enumMap.put(FISH, "Four");
        enumMap.put(DOG, "Five");
        enumMap.put(CAT, "Six");

        Set <Map.Entry<Animal, String>> entrySet = enumMap.entrySet();

        for (Map.Entry<Animal,String> entry : entrySet) {
             System.out.println(entry.getKey()+" "+entry.getValue());
        }


        System.out.println(enumMap);


    }
}
