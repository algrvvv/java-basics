package practice.ds.middle.first;

public class Main {
    public static void main(String[] args) {
        Attendance attendance = new Attendance();
        attendance.storeAttendance("Bob", 3);
        attendance.storeAttendance("John", 4);
        attendance.storeAttendance("Jack", 2);
        attendance.printAttendance();

        attendance.storeAttendance("Bob", 10);
        attendance.printAttendance();

        Integer bobAtt = attendance.getAttendanceByName("Bob");
        System.out.println(bobAtt);

        attendance.incrementAttendance("John");
        attendance.printAttendance();
    }
}
