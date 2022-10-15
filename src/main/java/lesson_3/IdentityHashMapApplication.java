package lesson_3;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapApplication {
        public static void main(String[] args) {
                IdentityHashMap<Integer, String> ihm = new IdentityHashMap();
                ihm.put(new Integer(1),"One");
                ihm.put(new Integer(1),"One");
                ihm.put(new Integer(2),"Two");
                ihm.put(new Integer(2),"Two");
                ihm.put(new Integer(21),"Twenty One");

                System.out.println(ihm);

                Set m = ihm.entrySet();

                for (Object o : m) {
                        Map.Entry s = (Map.Entry) o ;
                        System.out.println(s.getKey()+ " "+s.getValue());
                }


        }
}
