package myFirstProject.validator;

import myFirstProject.edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import myFirstProject.edu.javacourse.studentorder.domain.Person;

public interface CityRegisterChecker {
    CityRegisterCheckerResponse checkPerson(Person person);
}
