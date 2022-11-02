package myFirstProject.validator;

import myFirstProject.edu.javacourse.studentorder.domain.*;
import myFirstProject.edu.javacourse.studentorder.mail.MailSender;
import myFirstProject.validator.ChildrenValidator;
import myFirstProject.validator.CityRegisterValidator;
import myFirstProject.validator.StudentValidator;
import myFirstProject.validator.WeddingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator(){
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();

    }

    public static void main(String[] args) {
        StudentOrderValidator sv = new StudentOrderValidator();
        sv.checkAll();
    }
    public void checkAll(){
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
    public StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;
    }
    public AnswerCityRegister checkCityRegister(StudentOrder so){
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "hostName1";
        crv1.port = 123;
        crv1.login = "login1";
        crv1.password = "password1";
        return crv1.checkCityRegister(so);
    }
    public AnswerWedding checkWedding(StudentOrder so){
       return weddingVal.checkWedding(so);
    }
    public AnswerChildren checkChildren(StudentOrder so){
        return childrenVal.checkChildren(so);
    }
    public AnswerStudent checkStudent(StudentOrder so){
        return studentVal.checkStudent(so);
    }
     public void sendMail(StudentOrder so) {
         mailSender.sendMail(so);
    }
}
