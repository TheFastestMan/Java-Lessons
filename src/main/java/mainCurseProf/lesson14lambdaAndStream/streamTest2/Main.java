package mainCurseProf.lesson14lambdaAndStream.streamTest2;

import jdk.jfr.Event;
import org.w3c.dom.ls.LSOutput;

import javax.swing.text.Position;
import java.io.File;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

        private List<Employee> emps = List.of(new Employee("Jordan","Belford",5000,60,"CEO"),
                                        new Employee("Jon","Dooglas",3500,70,"Manager"),
                                        new Employee("Tommy","Lye",2500,65,"Worker"));

        private List<Department> deps = List.of(new Department(12,12,"West"),
                                                 new Department(1,2,"East"),
                                                 new Department(65,72,"Western-south"),
                                                 new Department(4,76,"South"),
                                                 new Department(8,128,"Northern-east"),
                                                 new Department(7,182,"North"));

        public void creation(){
                Stream<String> lines = File.lines(Paths.get("some.txt"));
                Stream<Path> list = File.list(Paths.get("./"));
                Stream<Path> walk = File.walk(Paths.get("./"));


        IntStream intStream = IntStream.of(1,2,3,4);
        DoubleStream doubleStream = DoubleStream.of(1.2,3.4);
        IntStream range = IntStream.range(10,100);
        IntStream intStream1 = IntStream.rangeClosed(10,100);

        int[] ints = {1,2,3,4};
        IntStream stream = Arrays.stream(ints);

        Stream<String> stringStream = Stream.of("1","2","3");
        Stream<? extends Serializable> stream1  = Stream.of(1,"2","3");

        Stream<String> build = Stream.<String>builder()
                .add("Mike")
                .add("Joe")
                .build();

        Stream<Employee> stream2 = emps.stream();
        Stream<Employee> employeeStream = emps.parallelStream();

        Stream<Event> generate = Stream.generate(()->
                new Event(UUID.randomUUID(), LocalDateTime.now(),"")
        );

        Stream<Integer> iterate = Stream.iterate(1950, val -> val + 3);

        Stream<String> concat = Stream.concat(stringStream, build);
        }

        public void terminate(){
                Stream<Employee> stream = emps.stream();
                stream.count();

                emps.stream().forEach(employee -> System.out.println(employee.getAge()));
                emps.forEach(employee -> System.out.println(employee.getAge()));

                emps.stream().forEachOrdered(employee -> System.out.println(employee.getAge()));

                emps.stream().collect(Collectors.toList());
                emps.stream().toArray();
                Map<Integer, String> collect = emps.stream().collect(Collectors.toMap(
                        Employee::getId,
                        emp -> String.format("%s %s",emp.getLastName(),emp.getName())
                ));

                IntStream intStream = IntStream.of(100,200,300,400);
                intStream.reduce((left, right) -> left+right).orElse(0);

                System.out.println(deps.stream().reduce(this::reducer));

                IntStream.of (100,200,300,400).average();
                IntStream.of (100,200,300,400).max();
                IntStream.of (100,200,300,400).min();
                IntStream.of (100,200,300,400).sum();
                IntStream.of (100,200,300,400).summaryStatistics();

                deps.stream().max(Comparator.comparingInt(Employee::getAge));

                emps.stream().findAny();
                emps.stream().findFirst();

                emps.stream().noneMatch(employee -> employee.getAge()>60);
                emps.stream().noneMatch(employee -> employee.getPosition()== Position.CEO);

                emps.stream()
                        .skip(3)
                        .limit(5);

                emps.stream()
                        .sorted(Comparator.comparingInt(Employee::getAge))
                        .peek(employee ->employee.setAge(18))
                        .map(employee -> String.format("%s %s", employee.getLastName(),employee.getName()));

                emps.stream().takeWhile(employee -> employee.getAge()>30).forEach(System.out::println);
                System.out.println();
                emps.stream().dropWhile(employee -> employee.getAge()>30).forEach(System.out::println);

                System.out.println();

                IntStream.of(100,200,300,400)
                        .flatMap(value -> IntStream.of(value - 50, value))
                        .forEach(System.out::println);

        }
        public void real(){
                Stream<Employee> empl = emps.stream()
                        .filter(employee ->
                                employee.getAge()<=30&& employee.getPosition()!=Position.WORKER
                        )
                        .sorted(Comparator.comparingInt(Employee::getLastName));

                print(empl);

                IntSummaryStatistics statistics = emps.stream()
                        .mapToInt(Employee::getAge)
                        .summaryStatistics();
                System.out.println(statistics);
        }
        private void print(Stream<Employee> stream){
                stream
                        .map(emp -> String.format(
                                "%4d | %-15s %-10s age %s %s",
                                emp.getId(),
                                emp.getLastName(),
                                emp.getName(),
                                emp.getAge(),
                                emp.getPosition()

                        ))
                        .forEach(System.out::println);
                System.out.println();
        }
        public Department reducer(Department parent, Department child){
                if (child.getParent() == parent.getId()){
                        parent.getChild().add(child);
                }else {
                        parent.getChild().forEach(subParent -> reducer((Department) subParent, child));
                }
                return parent;
        }

}

