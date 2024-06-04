package practice.ds.easy.first;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        Student bob = new Student("Bob", 19, 4);
        group.addStudent(bob);
        group.addStudent(new Student("John", 21, 4));
        group.addStudent(new Student("Jack", 20, 5));

        List<Student> groupStudents = group.getStudents();
        System.out.println(groupStudents);

        group.removeByStudent(bob);
        group.printGroup();
        group.removeByIndex(0);
        group.printGroup();
        Student notFoundedStudent = group.findStudentByName("John");
        System.out.println(notFoundedStudent);
        Student foundedStudent = group.findStudentByName("Jack");
        System.out.println(foundedStudent);
    }
}
