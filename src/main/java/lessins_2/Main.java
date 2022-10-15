package lessins_2;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Animal, String> enumMap = new EnumMap<Animal, String>(Animal.class);

        enumMap.put(Animal.HORSE,null); // We can have a null as a value but cannot as a key
        enumMap.put(Animal.SPIDER,"Two");
        enumMap.put(Animal.SCORPION,"Three");
        enumMap.put(Animal.FISH,"Four");

        Set set = enumMap.entrySet();

        for (Object o : set) {
            Map.Entry m = (Map.Entry)o;
            System.out.println(m.getKey()+" "+m.getValue());
        }


        System.out.println(enumMap);


    }
}
