package lessons_1;

import java.util.Objects;

public class Cat {
    String name;
    int countLegs;

    public Cat(String name, int countLegs) {
        this.name = name;
        this.countLegs = countLegs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return countLegs == cat.countLegs && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countLegs);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + name +
                ", countLegs=" + countLegs +
                '}';
    }
}
