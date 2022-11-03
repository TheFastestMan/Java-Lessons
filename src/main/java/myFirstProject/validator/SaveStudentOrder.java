package myFirstProject.validator;

import com.sun.jdi.request.ClassUnloadRequest;
import myFirstProject.edu.javacourse.studentorder.domain.*;

import java.time.LocalDate;
import java.time.Year;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder s = buildStudentOrder(10);
        System.out.println();

    }

    static long saveStudentOrder(StudentOrder studentOrder){
      long answer = 199;
        System.out.println("Student order: ");
       return answer;
    }
    public static StudentOrder buildStudentOrder(long id){
        StudentOrder so = new StudentOrder();
        so.setStudentOrderID(id);
        so.setMarriageCertificateID(""+(123456000+id));
        so.setMarriageOffice("ZAGS");

        so.setMarriageDate(LocalDate.of(2016,7,4));

        Address address = new Address("Wall Street","5-th Avenue","First line","1195");
        //Husband
        Adult husband = new Adult("Rick", "Morty", "SanOfMars",
                LocalDate.of(1718, 12, 03));
        husband.setAddress(address);
        husband.setPassportSeria(""+(1000+id));
        husband.setPassportNumber(""+(100000+id));
        husband.setIssueDepartment("Police"+id);
        husband.setIssueDate(LocalDate.of(2050,12,12));
        husband.setStudentOrderID(100000+id);
       

        //Wife
        Adult wife = new Adult("Marrly", "Monro", "DaughterOfUniverse",
                LocalDate.of(1666,11,11));
        wife.setAddress(address);
        wife.setPassportSeria(""+(2000+id));
        wife.setPassportNumber(""+(200000+id));
        wife.setIssueDepartment("Police"+id);
        wife.setIssueDate(LocalDate.of(1950,12,12));
        husband.setStudentOrderID(200000+id);

        //Child
        Child child = new Child("Fred", "Marggared", "SanOfRick",
                LocalDate.of(3010, 1, 5));
        child.setAddress(address);
        child.setCertificateNumber(""+(110+id));
        child.setIssueDate(LocalDate.of(1222,10,6));
        child.setIssueDepartment(""+(110+id));

        so.setHusband(husband);
        so.setWife(wife);
        so.setChild(child);

        return so;
    }
}
