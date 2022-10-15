package lesson_3;

import java.util.HashMap;
import java.util.Map;

public class HashMapApplication {
    public static void main(String[] args) {

             String[] people = new String[]{"Sean","Dave","Thomson","Joe"};

        HashMap <String, Human> humans = createHumanMap(people);
        humans.forEach((key, value) -> System.out.println(key + " - " + value)); //I have to think about it
    }
    private static HashMap<String, Human> createHumanMap (String[] people) {
        HashMap <String, Human> allHumans = new HashMap<>();

        for (String s:people) {
            allHumans.put(s,new Human(s));
        }
        return allHumans;
    }
}
