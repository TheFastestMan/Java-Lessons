package lesson_3;

import java.util.HashMap;

public class MainAnimal {
    public static void main(String[] args) {
        Animal cat = new Animal(666,"Sphinx ");
        Animal dog = new Animal( 5000,"German Shepherd ");
        Animal fish = new Animal( 100,"Gold fish ");

        HashMap<Animal,String> ahm = new HashMap<>();
        ahm.put(cat,"Six");
        ahm.put(dog,"Bob");
        ahm.put(fish,"NoName");

        Animal findName = new Animal( 5000,"German Shepherd ");

        System.out.println(ahm.get(findName));


    }
}
