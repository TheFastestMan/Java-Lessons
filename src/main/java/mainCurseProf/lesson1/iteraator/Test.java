package mainCurseProf.lesson1.iteraator;

import beginning.While;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {

        Student student1 = new Student("Rail", "Raul", "Ravilov", 1);
        Student student2 = new Student("Raul", "Rembo", "Ivanov", 12);
        Student student3 = new Student("Diger", "Rl", "Rov", 78);
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(student1);
        arr.add(student2);
        arr.add(student3);

        Iterator it = arr.iterator();

        while (it.hasNext()){
            Student st =(Student) it.next();
            int a = st.getId();
            a = a+999;
            System.out.println(st.getId());

            //System.out.println(a);
        }

    }
}
