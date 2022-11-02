package myFirstProject.validator;

import myFirstProject.edu.javacourse.studentorder.domain.AnswerChildren;
import myFirstProject.edu.javacourse.studentorder.domain.StudentOrder;

public class ChildrenValidator {

    AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Check children is running");
        AnswerChildren ans = new AnswerChildren();
        ans.success = false;
        return ans;
    }
}
