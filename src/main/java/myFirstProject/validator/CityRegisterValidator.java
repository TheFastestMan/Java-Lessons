package myFirstProject.validator;
import myFirstProject.edu.javacourse.studentorder.domain.AnswerCityRegister;
import myFirstProject.edu.javacourse.studentorder.domain.StudentOrder;

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
        personChecker.checkPerson(so.getHusband());
        personChecker.checkPerson(so.getWife());
        personChecker.checkPerson(so.getChild());
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
