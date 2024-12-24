package com.example.home.service_new;

import com.example.home.model_new.Task;
import com.example.home.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    // Создание задачи
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // Получение всех задач
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Обновление задачи
    public Task updateTask(int id, Task task) {
        task.setId(id);
        return taskRepository.save(task);
    }

    // Удаление задачи
    public void deleteTask(int id) {
        taskRepository.deleteById(id);
    }

    // Поиск задачи по ID
    public Optional<Task> getTaskById(int id) {
        return taskRepository.findById(id);
    }
}

