package lesson_3;

import java.util.HashMap;
import java.util.Map;

public class HashMapApplication {
    public static void main(String[] args) {

        String[] people = new String[]{"Sean","Dave","Thomson","Joe"};

        HashMap <String, Human> map = addHumanToMap(people);

        for (Map.Entry<String, Human> pair: map.entrySet()) {
            System.out.println(pair.getKey()+" - "+pair.getValue());
        }
    }
    private static HashMap<String, Human> addHumanToMap(String[] people) {
        HashMap <String, Human> allHumans = new HashMap<>();

        for (String s:people) {
            allHumans.put(s,new Human(s));
        }
        return allHumans;
    }
}
