package mainCurseProf.lesson1.foreach;

import mainCurseProf.lesson1.foreach.Animal;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Sphinx", 5000);
        Animal dog = new Animal("German shepherd", 5000);

        Animal[] x= {cat,dog};

        for (Animal an : x) {
            System.out.println(an);
        }
    }
}
