package edu.javacourse.studentorder;

import edu.javacourse.studentorder.dao.StudentOrderDaoIml;
import edu.javacourse.studentorder.dao.StudentOrderDao;
import edu.javacourse.studentorder.domain.*;

import java.time.LocalDate;

public class SaveStudentOrder
{
    public static void main(String[] args) throws Exception {
//        List<Street> d = new DictionaryDaoImpl().findStreets("");
//        for (Street s : d) {
//            System.out.println(s.getStreetName());
//        }
//       List<PassportOffice> po = new DictionaryDaoImpl().findPassportOffices("");
//        for (PassportOffice p : po) {
//            System.out.println(p.getOfficeName());
//        }
//        List<RegisterOffice> ro = new DictionaryDaoImpl().findRegisterOffices("");
//        for (RegisterOffice r : ro) {
//            System.out.println(r.getOfficeName());
//        }
//        List<CountryArea> ca = new DictionaryDaoImpl().findAreas("");
//        for (CountryArea c : ca) {
//            System.out.println(c.getAreaId()+ " : " +c.getAreaName());
//        }
//        System.out.println("--->");
//        List<CountryArea> ca1 = new DictionaryDaoImpl().findAreas("020000000000");
//        for (CountryArea c : ca1) {
//            System.out.println(c.getAreaId()+ " : " +c.getAreaName());
//        }
//        System.out.println("--->");
//        List<CountryArea> ca2 = new DictionaryDaoImpl().findAreas("020010000000");
//        for (CountryArea c : ca2) {
//            System.out.println(c.getAreaId()+ " : " +c.getAreaName());
//        }
//        System.out.println("--->");
//        List<CountryArea> ca3 = new DictionaryDaoImpl().findAreas("020010010000");
//        for (CountryArea c : ca3) {
//            System.out.println(c.getAreaId()+ " : " +c.getAreaName());
//        }
        StudentOrder s = buildStudentOrder(10);
        StudentOrderDao dao = new StudentOrderDaoIml();
        dao.saveStudentOrder(s);

    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder");

        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        so.setMarriageCertificateId("" + (123456000 + id));
        so.setMarriageDate(LocalDate.of(2016, 7, 4));

        RegisterOffice ro = new RegisterOffice(1L,"","");
        so.setMarriageOffice(ro);

        Street street = new Street(1L,"Заневский пр.");
        Address address = new Address("195000", street, "12", "", "142");

        // Муж
        Adult husband = new Adult("Петров", "Виктор", "Сергеевич", LocalDate.of(1997, 8, 24));
        husband.setPassportSeria("" + (1000 + id));
        husband.setPassportNumber("" + (100000 + id));
        husband.setIssueDate(LocalDate.of(2017, 9, 15));

        PassportOffice po1 = new PassportOffice(2L,"","");
        husband.setIssueDepartment(po1);
        husband.setStudentId("" + (100000 + id));
        husband.setAddress(address);
        // Жена
        Adult wife = new Adult("Петрова", "Вероника", "Алекссевна", LocalDate.of(1998, 3, 12));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("" + (200000 + id));
        wife.setIssueDate(LocalDate.of(2018, 4, 5));

        PassportOffice po2= new PassportOffice(2L,"","");
        wife.setIssueDepartment(po2);
        wife.setStudentId("" + (200000 + id));
        wife.setAddress(address);
        // Ребенок
        Child child1 = new Child("Петрова", "Ирина", "Викторовна", LocalDate.of(2018, 6, 29));
        child1.setCertificateNumber("" + (300000 + id));
        child1.setIssueDate(LocalDate.of(2018, 7, 19));

        RegisterOffice ro2 = new RegisterOffice(2L,"","");
        child1.setIssueDepartment(ro2);
        child1.setAddress(address);
        // Ребенок
        Child child2 = new Child("Петров", "Игорь", "Викторович", LocalDate.of(2018, 6, 29));
        child2.setCertificateNumber("" + (300000 + id));
        child2.setIssueDate(LocalDate.of(2018, 7, 19));

        RegisterOffice ro3= new RegisterOffice(3L,"","");
        child2.setIssueDepartment(ro3);
        child2.setAddress(address);
        so.setHusband(husband);
        so.setWife(wife);
        so.addChildren(child1);
        so.addChildren(child2);

        return so;
    }
}