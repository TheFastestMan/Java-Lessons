package lesson_3;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapApplication {
    public static void main(String[] args) {

        WeakHashMap<String, String> weakHashMap = new WeakHashMap();
        HashMap<String, String> hashMap = new HashMap();

        String keyWeakHashMap = new String("KeyWeakHashMap");
        String keyHashMap = new String("KeyHashMap");

        weakHashMap.put(keyWeakHashMap,"weakHash");
        hashMap.put(keyHashMap,"hash");

        System.out.println(weakHashMap+"  "+ hashMap);

        keyWeakHashMap = null;
        keyHashMap = null;

        System.out.println(weakHashMap+"  "+ hashMap);

        System.gc();

        System.out.println(weakHashMap+"  "+ hashMap);

    }
}
