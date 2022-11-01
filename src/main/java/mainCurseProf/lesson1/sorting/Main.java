package mainCurseProf.lesson1.sorting;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] arrInt = {12,2133,42,453,746575,56,75,634,52,342,4,21,4,12,4};
        String[] strArr = {"e","xref","vfefwWDwdc","Wdwfge","fdvweef","fewwedfwWDdc","we","ef","zxczxvewwWDwdc"};

        Arrays.sort(arrInt);
        Arrays.sort(strArr);

        for (int i:arrInt) {
            System.out.println(i);
        }
        System.out.println();

        for (String s : strArr) {
            System.out.println(s);
        }

     Animal cat = new Animal("KutakBush",123);
     Animal dog = new Animal("BatakBush",432);

        System.out.println(cat.getBreed());


        Animal[] an = {cat,dog};

//    Arrays.sort(an); ClassCastException

     for (Animal c:an){
         System.out.println(c);
     }





    }
}
