package advence.lambda;

public class Students  {
     String name;
     char sex;
     int age;
     int curse;
     double avgGrade;

    public Students(String name, char sex, int age, int curse, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.curse = curse;
        this.avgGrade = avgGrade;
    }


    @Override
    public String toString() {
        return  name +" : "+ sex +" : "+ age +" : "+ curse +" : "+ avgGrade;
    }

}
