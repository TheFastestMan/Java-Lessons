package myFirstProject.validator;
import myFirstProject.edu.javacourse.studentorder.CityRegisterException;
import myFirstProject.edu.javacourse.studentorder.domain.AnswerCityRegister;
import myFirstProject.edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import myFirstProject.edu.javacourse.studentorder.domain.StudentOrder;
import myFirstProject.validator.register.RealCityRegisterChecker;

public class CityRegisterValidator {
     String hostName;
     int port;
     String login;
     String password;

     private RealCityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new RealCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so){
        try {
            CityRegisterCheckerResponse hAns = personChecker.checkPerson(so.getHusband());
            CityRegisterCheckerResponse wAns = personChecker.checkPerson(so.getWife());
            CityRegisterCheckerResponse cAns = personChecker.checkPerson(so.getChild());
        } catch (CityRegisterException e) {
            e.printStackTrace(System.out);
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
