package myFirstProject.validator.register;

import myFirstProject.edu.javacourse.studentorder.CityRegisterException;
import myFirstProject.edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import myFirstProject.edu.javacourse.studentorder.domain.Person;

public interface CityRegisterChecker {
    CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;
}
