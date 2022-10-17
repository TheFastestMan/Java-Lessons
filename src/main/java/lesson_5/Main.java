package lesson_5;

import javax.swing.event.AncestorEvent;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        NavigableMap<String, Animal> tree = new TreeMap<>();

        tree.put("Rocky", new Animal(100));

        Animal dog = new Animal(200);
        tree.put("Bob", dog);

        tree.put("Six", new Animal(300));
        tree.put("Six", new Animal(300)); // The map does not allow to store a unique value, as a result,
                                                               // the map will overwrite the value with the next.

//        System.out.println(tree);
//        System.out.println(tree.get("Bob"));
//        System.out.println(tree.get("Six"));
//        System.out.println(tree.get("Rocky"));
//        System.out.println(tree.get(""));
//        System.out.println(tree.containsKey("Bob"));
//        System.out.println(tree.containsValue(dog));

        Set<Map.Entry<String,Animal>> keyAndValue = tree.entrySet();
//        System.out.println(keyAndValue);
        for (Map.Entry<String, Animal> tmp: keyAndValue) {
            tmp.setValue(new Animal(90));
        }
      //  System.out.println(keyAndValue);


        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();

        lhm.put("Ant","A");
        lhm.put("Cat","C");
        lhm.put("Dog","D");

        Set<Map.Entry<String,String>> entrySet = lhm.entrySet();

        for (Map.Entry<String, String> stringStringEntry : entrySet) {
            System.out.println(stringStringEntry.getKey()+" "+stringStringEntry.getValue());
        }


    }
}
