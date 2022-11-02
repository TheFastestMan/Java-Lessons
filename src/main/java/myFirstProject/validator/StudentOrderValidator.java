package myFirstProject.validator;

import myFirstProject.edu.javacourse.studentorder.domain.*;
import myFirstProject.edu.javacourse.studentorder.mail.MailSender;
import myFirstProject.validator.ChildrenValidator;
import myFirstProject.validator.CityRegisterValidator;
import myFirstProject.validator.StudentValidator;
import myFirstProject.validator.WeddingValidator;


public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();


    }
    static void checkAll(){
        while (true) {
            StudentOrder so = readStudentOrder();
            System.out.println("Start ");
            if (so == null){
                break;
            }
            System.out.println("Finish 1 ");
            AnswerCityRegister answerCity = checkCityRegister(so);
            if (!answerCity.success){
                continue;
            }
            AnswerChildren answerChildren = checkChildren(so);
            AnswerStudent answerStudent = checkStudent(so);
            AnswerWedding answerWedding = checkWedding(so);

            sendMail(so);
        }
        System.out.println("Finish 2 ");
    }
    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;
    }
    static AnswerCityRegister checkCityRegister(StudentOrder so){
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "hostName1";
        crv1.port = 123;
       // crv1.login = "login1";
        crv1.password = "password1";
        return crv1.checkCityRegister(so);

    }
    static AnswerWedding checkWedding(StudentOrder so){
        WeddingValidator wv1 = new WeddingValidator();
        wv1.hostName = "hostName1";
        wv1.login = "login1";
        wv1.password = "password1";
       return wv1.checkWedding(so);
    }
    static AnswerChildren checkChildren(StudentOrder so){
        ChildrenValidator ch1 = new ChildrenValidator();
        ch1.hostName = "hostName1";
        ch1.login = "login1";
        ch1.password = "password1";
        return ch1.checkChildren(so);
    }
    static AnswerStudent checkStudent(StudentOrder so){
        StudentValidator sv1 = new StudentValidator();
        sv1.hostName = "hostName1";
        sv1.login = "login1";
        sv1.password = "password1";
        return sv1.checkStudent(so);
    }
     static void sendMail(StudentOrder so) {
         new MailSender().sendMail(so);
    }
}
