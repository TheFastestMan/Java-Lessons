package mainCurseProf.lesson1.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Rail", 160293);
        myMap.put("RailStation", 465);
        myMap.put("RavilovRail", 4571);

      //  System.out.println(myMap);


        for (Map.Entry<String, Integer> m: myMap.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();

        for (Map.Entry<String, Integer> m: myMap.entrySet()) {
            System.out.println(m);
        }
    }

}
