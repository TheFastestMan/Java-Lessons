package mainCurseProf.lesson14lambdaAndStream.steamTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//Multiply integers
        List<Integer> listOfNum = Arrays.asList(12,32,54,76);
        listOfNum.stream()
                .map(integer -> integer*2)
                .forEach(System.out::println);
////////////////////////////////////////////////////////////////////////////////
        System.out.println();

//Capitalize Strings with Stream map()
        List<String> listOfString = Arrays.asList("one", "two", "three");
//        listOfString.stream()
//                .map(StringUtils::capitalize)
//                .forEach(System.out::println);
//////////////////////////////////////////////////////////////////////////////////

        System.out.println();
//Objects to Strings
        List<Car> car = Arrays.asList(new Car("AA1111BX", 2007),
                                      new Car("AP5478RX", 2006),
                                      new Car("BB9090RE", 2005),
                                      new Car("WQ5433BX", 1999),
                                      new Car("AA1233MX", 2022));
        car.stream()
                .map(Car::getNumber)
                .forEach(System.out::println);

        System.out.println();
//Stream filter + map()
        List<Car> cars = Arrays.asList(new Car("AA1111BX", 2007),
                                       new Car("", 2006),
                                       new Car("BB9090RE", 2005),
                                       new Car(null, 1999),
                                       new Car("AA1233MX", 2022));
        cars.stream()
                .filter(c -> c.getYear()<=2010)
                .map(Car::getNumber)
                .filter(s -> s != null && !s.isEmpty())
                .forEach(System.out::println);

        System.out.println();

        List<String> str = Arrays.asList("long", " to possess", "hate","love", "an obstacle");

        str.stream()
                .map(s -> s.length())
                .forEach(System.out::println);




    }
}
