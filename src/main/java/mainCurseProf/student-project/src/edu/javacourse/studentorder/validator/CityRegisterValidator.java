package edu.javacourse.studentorder.validator;
import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.domain.register.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.validator.register.CityRegisterChecker;
import edu.javacourse.studentorder.validator.register.FakeCityRegisterChecker;
import java.util.Iterator;


public class CityRegisterValidator
{
    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        try {
            CityRegisterCheckerResponse hans = personChecker.checkPerson(so.getHusband());
            CityRegisterCheckerResponse wans = personChecker.checkPerson(so.getWife());



            //List<Child> children = so.getChildren();
            Iterator<Child> iter = so.getChildren().iterator();

            while (iter.hasNext()){
                Child child = iter.next();
                CityRegisterCheckerResponse cans = personChecker.checkPerson(child);

            }
                } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}