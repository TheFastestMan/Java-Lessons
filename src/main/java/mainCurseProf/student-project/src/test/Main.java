package test;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Human h = new Human();
        Animal.c(h);
    }
}
class Cat extends Animal{
}
class Animal{
    public static void c(Human d) {
        if (d instanceof Dog) {
            System.out.println("Yes");
        }
        System.out.println("No");

    }
}
class Dog extends Human{
}
class Human{

}