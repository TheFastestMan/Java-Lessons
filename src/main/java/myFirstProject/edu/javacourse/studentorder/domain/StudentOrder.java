package myFirstProject.edu.javacourse.studentorder.domain;

import java.time.LocalDate;
import java.util.Date;

public class StudentOrder{
    private long StudentOrderID;
   private String marriageCertificateID;
   private LocalDate marriageDate;
   private String marriageOffice;
   private Adult husband;
   private Adult wife;
   private Child child;

    public long getStudentOrderID() {
        return StudentOrderID;
    }

    public void setStudentOrderID(long studentOrderID) {
        StudentOrderID = studentOrderID;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public String getMarriageCertificateID() {
        return marriageCertificateID;
    }

    public void setMarriageCertificateID(String marriageCertificateID) {
        this.marriageCertificateID = marriageCertificateID;
    }

    public LocalDate getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        this.marriageDate = marriageDate;
    }

    public String getMarriageOffice() {
        return marriageOffice;
    }

    public void setMarriageOffice(String marriageOffice) {
        this.marriageOffice = marriageOffice;
    }
}
