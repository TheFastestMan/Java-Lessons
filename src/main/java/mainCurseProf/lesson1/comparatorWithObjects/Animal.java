package mainCurseProf.lesson1.comparatorWithObjects;

import java.util.Comparator;

public class Animal {
   private String breed;
    private String kindOfAnimal;
    private int price;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getKindOfAnimal() {
        return kindOfAnimal;
    }

    public void setKindOfAnimal(String kindOfAnimal) {
        this.kindOfAnimal = kindOfAnimal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

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
        return ((Animal)o1).getBreed().compareTo(((Animal) o1).getBreed());
    }
}
class CompareByPrice implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal) o1).getPrice() - ((Animal) o2).getPrice();
    }
}
class CompareByKindOfAnimal implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal) o1).getKindOfAnimal().compareTo(((Animal) o2).getKindOfAnimal());
    }
}