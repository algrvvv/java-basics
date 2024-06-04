package practice.ds.middle.first;

import java.util.HashMap;
import java.util.Map;

public class Attendance {
    private final Map<String, Integer> attendance = new HashMap<String, Integer>();

    public Attendance() {
    }

    /**
     * Добавление нового студента
     *
     * @param studentName имя студента
     * @param att количество посещенных занятий
     */
    public void storeAttendance(String studentName, int att) {
        attendance.put(studentName, att);
    }

    /**
     * Получение посещаемости студента по имени
     *
     * @param studentName имя студента
     * @return колво посещений
     */
    public int getAttendanceByName(String studentName) {
        return attendance.get(studentName);
    }

    public void incrementAttendance(String studentName) {
        attendance.put(studentName, attendance.get(studentName) + 1);
    }

    /**
     * Вывод данных
     */
    public void printAttendance() {
        System.out.println(attendance);
    }

}
