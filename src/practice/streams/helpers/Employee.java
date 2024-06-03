package practice.streams.helpers;

public record Employee(String name, int salary) {
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
