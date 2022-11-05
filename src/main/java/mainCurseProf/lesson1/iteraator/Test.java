package mainCurseProf.lesson1.iteraator;

import beginning.While;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student("w","w","w",123);
        Student s2 = new Student("r","r","r",321);
        Student s3 = new Student("o","o","o",345);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator <Student> iter = list.iterator();
        while (iter.hasNext()){
            Student s = iter.next();
            System.out.println(s);
        }
    }
}
