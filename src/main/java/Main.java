import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);

        Iterator iterator = list.iterator();

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
