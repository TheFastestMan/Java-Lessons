package myFirstProject.edu.javacourse.studentorder;

import myFirstProject.edu.javacourse.studentorder.domain.Adult;
import myFirstProject.edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        buildStudentOrder();

    }
    static long saveStudentOrder(StudentOrder studentOrder){
      long answer = 199;
        System.out.println("Student order: ");
       return answer;
    }
    static StudentOrder buildStudentOrder(){
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setSurName("Mark");
        husband.setGivenName("Doers");
        husband.setPassportNumber("1265344688");
        so.setHusband(husband);
        return so;
    }
}
