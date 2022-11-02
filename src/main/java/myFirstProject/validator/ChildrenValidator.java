package myFirstProject.validator;

import myFirstProject.edu.javacourse.studentorder.domain.AnswerChildren;
import myFirstProject.edu.javacourse.studentorder.domain.StudentOrder;

public class ChildrenValidator {
    String hostName;
    String login;
    String password;

    AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Check children is running"+hostName+" "+login+" "+password);
        AnswerChildren ans = new AnswerChildren();
        ans.success = false;
        return ans;
    }
}
