package myFirstProject.validator.register;

import myFirstProject.edu.javacourse.studentorder.CityRegisterException;
import myFirstProject.edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import myFirstProject.edu.javacourse.studentorder.domain.Person;
import myFirstProject.validator.register.CityRegisterChecker;

public class RealCityRegisterChecker implements CityRegisterChecker {

    public CityRegisterCheckerResponse checkPerson(Person person)
            throws CityRegisterException {
        return null;
    }

}
