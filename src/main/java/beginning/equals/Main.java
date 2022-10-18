package beginning.equals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scorpion scor = new Scorpion("Insect");
        Goose goo = new Goose("Mammal");
        Goose goo2 = new Goose("Mammal");
        String a = "ABCD123".substring(4,7);
        System.out.println(a);


        System.out.println(goo2.equals(goo));
    }
}
