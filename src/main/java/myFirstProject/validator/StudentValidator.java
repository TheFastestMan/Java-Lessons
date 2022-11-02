package myFirstProject.validator;

import myFirstProject.edu.javacourse.studentorder.domain.AnswerStudent;
import myFirstProject.edu.javacourse.studentorder.domain.StudentOrder;

public class StudentValidator {
    String hostName;
    String login;
    String password;

    AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Check student is running"+hostName+" "+login+" "+password);
        AnswerStudent ans = new AnswerStudent();
        ans.success = false;
        return ans;
    }
}
