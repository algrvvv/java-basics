package practice.streams.helpers;

public record HardEmployee(String name, int salary, String department ) {
    public HardEmployee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
}
