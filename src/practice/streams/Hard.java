package practice.streams;

import practice.streams.helpers.HardEmployee;
import practice.streams.helpers.Person;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Hard {
    /**
     * Сложный уровень. Статистика зарплат. Сложная фильтрация и трансформация.
     *
     * @param args args
     */
    public static void main(String[] args) {
        System.out.println("Статистка зарплата по департаментам\n");

        List<HardEmployee> employees = new ArrayList<>();
        employees.add(new HardEmployee("Bob", 75000, "IT"));
        employees.add(new HardEmployee("John", 35000, "HR"));
        employees.add(new HardEmployee("Jack", 55000, "IT"));

        Map<String, Double> employeesAvgMap = employees.stream()
                .collect(Collectors.groupingBy(
                        HardEmployee::department,
                        Collectors.averagingDouble(HardEmployee::salary)
                ));

        System.out.println(employeesAvgMap);

        List<String> persons = Arrays.asList("John:38", "Bob:40", "Jack:29");

       List<Person> sortedPerson = persons.stream().map(p -> {
           String[] split = p.split(":");
           return new Person(split[0], Integer.parseInt(split[1]));
       }).filter(p -> p.age() > 30).sorted(Comparator.comparing(Person::name)).toList();

        System.out.println(sortedPerson);

    }
}
