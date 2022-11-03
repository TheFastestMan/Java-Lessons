package myFirstProject.edu.javacourse.studentorder;

import myFirstProject.edu.javacourse.studentorder.domain.Adult;
import myFirstProject.edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
//        buildStudentOrder();

    }
    static long saveStudentOrder(StudentOrder studentOrder){
      long answer = 199;
        System.out.println("Student order: ");
       return answer;
    }
    public static StudentOrder buildStudentOrder(long id){
        StudentOrder so = new StudentOrder();
        so.setStudentOrderID(id);

        return so;
    }
}
