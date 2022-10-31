package mainCurseProf.lesson1.iteraator;

import java.net.InterfaceAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List <String> arr = new ArrayList<>();
//
//        arr.add("JKNnkwdj");
//        arr.add("JKNnkefwdj");
//        arr.add("JKerfNnkwdj");
//
//        Iterator iter = arr.iterator();
//
//        while (iter.hasNext()){
//            String innthuint = (String) iter.next();
//            String b = innthuint.toLowerCase();
//                System.out.println(b);
//            System.out.println();
//            String g = innthuint.substring(0,5);
//            System.out.println(g);
//
//        }

        Student s1 = new Student("Sean","Scott","Dorset",324);
        Student s2 = new Student("Djorj","W","Junior",654);
        Student s3 = new Student("Jess","Middle","Nemmer",876);
        Student s4 = new Student("Ivan","InTheMiddle","Dick",987);
        Student s5 = new Student("Cock","Loser","Duccer",555);
        Student s6 = new Student("Lama","Bama","Jama",876);
        Student s7 = new Student("Six","Nikky","Love",987);
        Student s8 = new Student("Tommy","Lee","Vasy",345);
        Student s9 = new Student("Or","Else","While",223);
        Student s10 = new Student("I","HaveNo","Idea",223);
        Student s11 = new Student("Finally","IDid","It",987);

        List<Student> listofStudents = new ArrayList<>();

        listofStudents.add(s1);
        listofStudents.add(s2);
        listofStudents.add(s3);
        listofStudents.add(s4);
        listofStudents.add(s5);
        listofStudents.add(s6);
        listofStudents.add(s7);
        listofStudents.add(s8);
        listofStudents.add(s9);
        listofStudents.add(s10);
        listofStudents.add(s11);


        Iterator iter = listofStudents.iterator();

        while (iter.hasNext()){
            Student newS = (Student) iter.next();
            System.out.println(newS);
        }


    }
}
