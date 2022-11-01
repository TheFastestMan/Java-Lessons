package mainCurseProf.lesson2.linkedListVsArrayList;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new LinkedList()));
        System.out.println(getTimeMsOfInsert(new ArrayList()));
    }


    public static long getTimeMsOfInsert(List list) {
        Date currentTime = new Date();
        insert100000(list);
        Date newTime = new Date();
        long time = newTime.getTime()-currentTime.getTime();
        System.out.println(time);
        return time;

    }
    public static void insert100000(List list){
        for (int i = 0; i < 100000; i++) {
            list.add(0,new Object());
        }

    }
}
