package practice.streams.helpers;

public record Person(String name, int age) {
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
