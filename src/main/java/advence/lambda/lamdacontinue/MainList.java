package advence.lambda.lamdacontinue;

import advence.lambda.Main;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        Student student1 = new Student("Vasy",21,'m',2,2.2);
        Student student2 = new Student("Luda",32,'f',5,10);
        Student student3 = new Student("Igor",19,'m',1,4.3);
        ArrayList <Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        MainList mainList = new MainList();
        mainList.generalCheck(studentList,(Student s) -> {return s.age == 19;});
        mainList.generalCheck(studentList,(Student s) -> {return s.curs == 1;});
        mainList.generalCheck(studentList, (Student s) -> {return s.avgGrade == 9;});


//        mainList.generalCheck(studentList, new StudentChecking() {
//            @Override
//            public boolean check(Student s) {
//                return s.sex!='m';
//            }                                                       /// ANONYMOUS CLASS
//        });



    }
    void generalCheck (ArrayList<Student>a, StudentChecking sc){
        for (Student std : a) {
            if (sc.check(std)){
                System.out.println(std);
            }
        }

    }



}
