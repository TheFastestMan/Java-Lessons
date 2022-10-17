package beginning;

public class Human {
     private String name;
     private int age;
     public static int countPeople;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;

    }

    public void setName(String name) {
        if (!name.isEmpty()){
        this.name = name;}
        else
            System.out.println("Write the name down below, now!");
    }

    public void setAge(int age) {
        if (age>0){
        this.age = age;}
        else
            System.out.println("Write fucking down the fucking age, an idiot!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name +" "+ age;
    }
    public static void numberOfPeople(){
        System.out.println("Number of people is "+countPeople);
    }
}
