package practice.ds.easy.second;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class SimpleTaskManager {
    private final Queue<Task> tasks = new ArrayDeque<>();

    public SimpleTaskManager() {
    }

    /**
     * @param tasks задачи
     */
    public SimpleTaskManager(List<Task> tasks) {
        this.tasks.addAll(tasks);
    }

    /**
     * @param tasks задачи
     */
    public SimpleTaskManager(Task[] tasks) {
        this.tasks.addAll(Arrays.asList(tasks));
    }

    /**
     * Добавление новой задачи
     *
     * @param task задача
     */
    public void storeTask(Task task) {
        tasks.add(task);
    }

    public boolean hasNextTask() {
        return !tasks.isEmpty();
    }

    /**
     * Отдаем следующую задачу
     *
     * @return некст задача
     */
    public Task getNextTask() {
        return tasks.poll();
    }

}
