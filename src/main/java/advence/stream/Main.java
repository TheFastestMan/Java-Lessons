package advence.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello ");
        list.add("from ");
        list.add("a stream ");
        list.add("curse ");

        List<Integer> list2 = list.stream().map(element->element.length())
                .collect(Collectors.toList());

       System.out.println(list2);

        int[] array = {4,5,6,9};

        array = Arrays.stream(array).map(element->
        {  if (element%3==0){
           element = element/3;
        }
           return element;}).toArray();

        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Hello ");
        set.add("from ");
        set.add("a stream ");
        set.add("curse ");

        Set<Integer> set2 = set.stream().map(element->element.length())
                .collect(Collectors.toSet());
        System.out.println(set2);





    }
}