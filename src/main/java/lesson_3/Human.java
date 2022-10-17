package lesson_3;

public class Human {
      private String names;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Human(String nane) {
        this.names = nane;
    }

    @Override
    public String toString() {
        return names != null ? names.toUpperCase():null;
    }
}
