package practice.streams.helpers;

public record Student(String name, int grade) {
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}
