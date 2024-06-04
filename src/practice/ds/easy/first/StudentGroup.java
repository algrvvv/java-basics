package practice.ds.easy.first;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private final List<Student> students = new ArrayList<>();

    /**
     * Добавление нового студента в группу
     *
     * @param student студент
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Удаление студента из группы
     *
     * @param student студент
     */
    public void removeByStudent(Student student) {
        students.remove(student);
    }

    /**
     * Удаление студента из группы по индексу
     *
     * @param index индекс студента
     */
    public void removeByIndex(int index) {
        students.remove(index);
    }

    /**
     * Получение всего списка группы
     *
     * @return список всех студентов
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Вывод всей группы студентов
     */
    public void printGroup() {
        System.out.println(students);
    }

    /**
     * Поиск студента по имени
     *
     * @param name имя студента
     * @return студент
     */
    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.name().equals(name)) return student;
        }

        return null;
    }

}
