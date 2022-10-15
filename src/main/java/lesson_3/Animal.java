package lesson_3;

import java.util.Objects;

public class Animal {
    private int price;
    private String breed;

    public void setPrice(int price) {
        this.price = price;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getPrice() {
        return price;
    }
    public String getBreed() {
        return breed;
    }

    public Animal(int price, String breed) {
        this.price = price;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return price + breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(breed, animal.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }
}
