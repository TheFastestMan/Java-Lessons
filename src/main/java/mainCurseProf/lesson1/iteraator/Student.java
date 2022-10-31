package mainCurseProf.lesson1.iteraator;

public class Student {
    private String firstName;
    private String sureName;
    private String lastName;
    private int id;

    public Student(String firstName, String sureName, String lastName, int id) {
        this.firstName = firstName;
        this.sureName = sureName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return firstName + " " + sureName + " " + lastName + " " + id;
    }
}
