package mainCurseProf.lesson14lambdaAndStream.stream;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Mike", 15));
        persons.add(new Person("Sean", 36));
        persons.add(new Person("Dave", 45));
        persons.add(new Person("Jes", 53));

        persons.stream()
                .filter(p -> p.getAge() >= 50)
                .sorted(Comparator.comparing(Person::getName))
                .map(Person::getName)
                .forEach(
                        System.out::println
                );






    }
}
