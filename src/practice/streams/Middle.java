package practice.streams;

import practice.streams.helpers.Employee;
import practice.streams.helpers.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Middle {
    /**
     *
     * Средний уровень. Сортировка сотрудников. Группировка студентов.
     *
     * @param args args
     */
    public static void main(String[] args) {
        System.out.println("Сортировка сотрудников\n");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bob", 45000));
        employees.add(new Employee("Jack", 30000));
        employees.add(new Employee("John", 50000));

        employees.stream().sorted((e1, e2) -> e2.salary() - e1.salary()).forEach(System.out::println);

        // В идеале использовать вместо лямбды Double.compare(e2.sal(), e1.sal());

        System.out.println("Группировка студентов\n");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 5));
        students.add(new Student("Jack", 4));
        students.add(new Student("John", 4));

        // Альтернатива Laravel Collections `groupBy()` method
        Map<Integer, List<Student>> studentsMap = students.stream()
                .collect(Collectors.groupingBy(Student::grade));


        System.out.println(studentsMap);
    }
}
