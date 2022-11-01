package mainCurseProf.lesson1.comparatorWithObjects;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Animal animal1 = new Animal("Sphinx", "Cat", 1000);
        Animal animal2 = new Animal("German shepherd", "Dog", 5000);
        Animal animal3 = new Animal("Goland", "Rooster", 600);
        Animal animal4 = new Animal("Arabian", "Horse", 15000);
        Animal animal5 = new Animal("Cobra", "Snake", 2999);

        Animal[] an = {animal1,animal2,animal3,animal4,animal5};

        Arrays.sort(an, new CompareByBreed());
        for (Animal animal : an) {
            System.out.println(animal);
        }
        System.out.println();

        Arrays.sort(an, new CompareByKindOfAnimal());
        for (Animal animal : an) {
            System.out.println(animal);
        }
        System.out.println();

        Arrays.sort(an, new CompareByPrice());
        for (Animal animal : an) {
            System.out.println(animal);
        }









    }
}
