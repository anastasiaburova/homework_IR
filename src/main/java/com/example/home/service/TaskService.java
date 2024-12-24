package com.example.home.service;

import com.example.home.model_new.Task;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

@Service
public class TaskService {
    private final Map<Integer, Task> taskMap = new HashMap<>();

    // Создание задачи
    public String createTask(Task task) {
        if (taskMap.containsKey(task.getId())) {
            return "Task with this ID already exists.";
        }
        taskMap.put(task.getId(), task);
        return "Task added successfully.";
    }

    // Получение всех задач
    public List<Task> getAllTasks() {
        return new ArrayList<>(taskMap.values());
    }

    // Обновление задачи
    public String updateTask(int id, Task task) {
        if (!taskMap.containsKey(id)) {
            return "Task not found.";
        }
        taskMap.put(id, task);
        return "Task updated successfully.";
    }

    // Удаление задачи
    public String deleteTask(int id) {
        if (taskMap.remove(id) != null) {
            return "Task deleted successfully";
        }
        return "Task not found.";
    }
}


