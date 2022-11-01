package mainCurseProf.lesson1.comparatorWithObjects;

import java.util.Comparator;

public class Animal {
    String breed;
    String kindOfAnimal;
    int price;

    public Animal(String breed, String kindOfAnimal, int price) {
        this.breed = breed;
        this.kindOfAnimal = kindOfAnimal;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", kindOfAnimal='" + kindOfAnimal + '\'' +
                ", price=" + price +
                '}';
    }
}
class CompareByBreed implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal)o1).breed.compareTo(((Animal)o1).breed);
    }
}
class CompareByPrice implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal)o1).price - ((Animal)o2).price;
    }
}
class CompareByKindOfAnimal implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal)o1).kindOfAnimal.compareTo(((Animal)o2).kindOfAnimal);
    }
}