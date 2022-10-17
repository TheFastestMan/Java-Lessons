package beginning;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Boo",212);
        Horse horse = new Horse("Bad ass",666);

        cow.eat();
        cow.moo();
        cow.makeSound();
        horse.neighs();
        horse.eat();
        horse.makeSound();
        System.out.println(horse);
        System.out.println(cow);
    }


}
