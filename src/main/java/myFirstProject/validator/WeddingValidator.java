package myFirstProject.validator;

import myFirstProject.edu.javacourse.studentorder.domain.AnswerWedding;
import myFirstProject.edu.javacourse.studentorder.domain.StudentOrder;

public class WeddingValidator {

    AnswerWedding checkWedding(StudentOrder so){
        System.out.println("Check wedding is running");
        AnswerWedding ans = new AnswerWedding();
        ans.success = false;
        return ans;
    }
}
