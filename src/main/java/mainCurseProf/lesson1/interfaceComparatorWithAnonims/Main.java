package mainCurseProf.lesson1.interfaceComparatorWithAnonims;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Potato p1 = new Potato("Yarmak",50,200,10);
        Potato p2 = new Potato("South",25,150,3);
        Potato p3 = new Potato("Ejip",45,190,9);
        Potato p4 = new Potato("Europ",50,200,10);
        Potato p5 = new Potato("Left",10,200,2);


        Potato[] pot = {p1,p2,p3,p4,p5};

        Arrays.sort(pot, new Comparator<Potato>(){
            @Override
            public int compare(Potato o1, Potato o2) {
                return o1.price - o2.price;}
        });
        for (Potato p : pot) {
            System.out.println(p);
        }
        System.out.println();
        Arrays.sort(pot, new Comparator<Potato>(){
            @Override
            public int compare(Potato o1, Potato o2) {
                return o1.averageWeightOfUnit - o2.averageWeightOfUnit;}
        });
        for (Potato p : pot) {
            System.out.println(p);
        }
        System.out.println();
        Arrays.sort(pot, new Comparator<Potato>(){
            @Override
            public int compare(Potato o1, Potato o2) {
                return o1.rateOfQuality - o2.rateOfQuality;}
        });
        for (Potato p : pot) {
            System.out.println(p);
        }




    }
}
