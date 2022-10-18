package beginning.wraperedClass;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        Price p = new Price();
        List list = new ArrayList();
        list.add(1);
        list.add("DownCast");
        list.add(p);

        System.out.println((Integer)list.get(0)+" "+(String)list.get(1)+" "+(Price)list.get(2));
    }
}
class Price{

}