package practice.ds.easy.first;

public record Student(String name, int age, int grade) {
    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
