package beginning.equals;

import java.util.Objects;

public class Goose {
    private String kindOfAnimal;

    public Goose(String kindOfAnimal) {
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
        Goose goose = (Goose) o;
        return Objects.equals(kindOfAnimal, goose.kindOfAnimal);
    }


}
