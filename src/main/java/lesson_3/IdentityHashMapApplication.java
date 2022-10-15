package lesson_3;

import java.util.HashMap;
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
                        Map.Entry <Integer,String> s = (Map.Entry<Integer,String>) o ;
                        System.out.println(s.getKey()+ "  "+s.getValue());
                }
                System.out.println();

                HashMap<Integer, String> hm = new HashMap();
                hm.put(new Integer(1),"One");
                hm.put(new Integer(1),"One");
                hm.put(new Integer(2),"Two");
                hm.put(new Integer(2),"Two");
                hm.put(new Integer(21),"Twenty One");

                System.out.println(hm);

                Set q = hm.entrySet();

                for (Object p : q) {
                        Map.Entry r = (Map.Entry) p ;
                        System.out.println(r.getKey()+ "  "+r.getValue());
                }


        }
}
