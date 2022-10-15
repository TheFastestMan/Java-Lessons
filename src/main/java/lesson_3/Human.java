package lesson_3;
import java.util.Locale;

public class Human {
      private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(String nane) {
        this.name = nane;
    }

    @Override
    public String toString() {
        return name != null ?name.toUpperCase():null;
    }
}
