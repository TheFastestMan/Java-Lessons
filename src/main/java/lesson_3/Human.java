package lesson_3;

import java.util.Locale;

public class Human {
    String nane;

    public Human(String nane) {
        this.nane = nane;
    }

    @Override
    public String toString() {
        return nane != null ?nane.toUpperCase():null;
    }
}
