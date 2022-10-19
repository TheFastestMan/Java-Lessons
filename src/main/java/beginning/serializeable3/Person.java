package beginning.serializeable3;

import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    public int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name +" : "+ id;
    }
}
