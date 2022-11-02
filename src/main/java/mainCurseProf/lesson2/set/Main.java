package mainCurseProf.lesson2.set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Set<String> newSet = new HashSet();
//        ArrayList<String>newList = new ArrayList<>();
//        newSet.add("Rail");
//        newSet.add("Rail");
//        newSet.add("Ramil");
//        newSet.add("Ramil");
//        newSet.add("Ramil");
//
//        newList.add("Rail");
//        newList.add("Rail");
//        newList.add("Rail");
//        newList.add("Ramil");
//        newList.add("Ramil");
//
//        System.out.println(newSet);
//        System.out.println();
//        System.out.println(newList);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        a.addAll(Arrays.asList(new Integer[]{1,2,4,5,6,7,8,9}));
        b.addAll(Arrays.asList(new Integer[]{10,20,48,5,60,7,88,9}));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Union of 2 sets");
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of two sets");
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<>(b);
        difference.removeAll(a);
        System.out.println("Diff");
        System.out.println(difference);

        Set<String> setOf = new HashSet<>();
        setOf.add("A");
        setOf.add("B");
        setOf.add("C");

        System.out.println(setOf);




    }
}
