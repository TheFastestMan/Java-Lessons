package lesson_3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put(null, 10);
        hm.put(null, 100);

        System.out.println(hm);
    }
}
