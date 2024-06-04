package practice.ds.easy.second;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int managerCount = 1;

    public static void main(String[] args) {
        SimpleTaskManager taskManager = new SimpleTaskManager();
        taskManager.storeTask(new Task(1, "Первая задача"));
        taskManager.storeTask(new Task(2, "Вторая задача"));

        loopInTasks(taskManager);

        SimpleTaskManager taskManager2 = new SimpleTaskManager(new Task[]{
                new Task(3, "Третья задача"),
                new Task(4, "Четвертая задача")
        });

        loopInTasks(taskManager2);

        SimpleTaskManager taskManager3 = new SimpleTaskManager(
                new ArrayList<>(Arrays.asList(
                        new Task(5, "Пятая задача"),
                        new Task(6, "Шестая задача")
                ))
        );

        loopInTasks(taskManager3);
    }

    public static void loopInTasks(SimpleTaskManager taskManager) {
        System.out.println("Таскманагер №" + managerCount++);
        while (taskManager.hasNextTask()) {
            Task nextTask = taskManager.getNextTask();
            System.out.println(nextTask);
        }
        System.out.println("задачи закончились...");
        System.out.println();
    }
}
