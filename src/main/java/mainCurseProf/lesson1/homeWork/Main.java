package mainCurseProf.lesson1.homeWork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal an1 = new Animal("Dog", "Dog",1,1,1);
        Animal an2 = new Animal("Dog", "Dog",1,1,1);
        Animal an3 = new Animal("Dog", "Dog",1,1,1);

        Animal[] anm = {an1,an2,an3};

        Arrays.sort(anm);

        for (Animal animal : anm) {
            System.out.println(animal);;
        }

    }
}
