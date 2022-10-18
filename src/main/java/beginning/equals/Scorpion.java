package beginning.equals;

import java.util.Objects;

public class Scorpion {
    private String kindOfAnimal;

    public Scorpion(String kindOfAnimal) {
        this.kindOfAnimal = kindOfAnimal;
    }

    @Override
    public String toString() {
        return kindOfAnimal ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scorpion scorpion = (Scorpion) o;
        return Objects.equals(kindOfAnimal, scorpion.kindOfAnimal);
    }

}
