package myFirstProject.validator;

import myFirstProject.edu.javacourse.studentorder.domain.AnswerCityRegister;
import myFirstProject.edu.javacourse.studentorder.domain.StudentOrder;

public class CityRegisterValidator {
     String hostName;
     int port;
     String login;
     String password;

    AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("City register is running: "+hostName+" "+port+" "+login+" "+password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
