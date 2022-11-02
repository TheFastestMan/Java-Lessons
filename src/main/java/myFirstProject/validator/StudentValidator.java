package myFirstProject.validator;

import myFirstProject.edu.javacourse.studentorder.domain.AnswerStudent;
import myFirstProject.edu.javacourse.studentorder.domain.StudentOrder;

public class StudentValidator {


    AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Check student is running");
        AnswerStudent ans = new AnswerStudent();
        ans.success = false;
        return ans;
    }
}
