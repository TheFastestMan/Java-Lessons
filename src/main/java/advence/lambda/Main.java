package advence.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("Ivan", 'm', 19, 4, 6.3);
        Students s2 = new Students("Young", 'm', 18, 3, 5.1);
        Students s3 = new Students("Lubonka", 'f', 35, 4, 9.9);
        Students s4 = new Students("Feramontyy", 'm', 19, 2, 3.2);

        ArrayList<Students> sList = new ArrayList<>();
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
        sList.add(s4);

        Main mainInfo = new Main();
        mainInfo.printStudentsOverGrade(sList, 7);
        //mainInfo.printStudentsUnderAge((ArrayList<Students>)sList, 3);
        //mainInfo.printStudentsMixCondition((ArrayList<Students>) sList,12,2.2,'f');


    }


    void printStudentsOverGrade(ArrayList<Students> al, double grade){
        for (Students s: al) {
            if (s.avgGrade>grade){
                System.out.println(s);
            }
        }
            }
    void printStudentsUnderAge(ArrayList<Students> al, int age){
        for (Students s:al) {
            if (s.age>age){
                System.out.println(s);
            }
        }
            }
    void printStudentsMixCondition(ArrayList<Students> al,int age, double grade, char sex){
        for (Students s:al) {
            if (s.age>age && s.avgGrade>grade && s.sex==sex){
                System.out.println(s);
            }
        }
            }

}
