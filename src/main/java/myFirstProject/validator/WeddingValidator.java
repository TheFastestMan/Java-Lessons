package myFirstProject.validator;

import myFirstProject.edu.javacourse.studentorder.domain.AnswerWedding;
import myFirstProject.edu.javacourse.studentorder.domain.StudentOrder;

public class WeddingValidator {
    String hostName;
    String login;
    String password;

    AnswerWedding checkWedding(StudentOrder so){
        System.out.println("Check wedding is running"+hostName+" "+login+" "+password);
        AnswerWedding ans = new AnswerWedding();
        ans.success = false;
        return ans;
    }
}
