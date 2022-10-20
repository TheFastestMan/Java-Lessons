package advence.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
        System.out.println();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i);
        }
    }
}
