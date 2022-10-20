package advence.lambda.lamdacontinue;

public class Student {
    String name;
    int age;
    char sex;
    int curs;
    double avgGrade;

    public Student(String name, int age, char sex, int curs, double avgGrade) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.curs = curs;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return  name + " " + age + " " + sex + " " + curs + " " + avgGrade;
    }

}
/////////////////////////////////////////////////////////////