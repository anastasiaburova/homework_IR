package com.example.home.controller;

import com.example.home.model_new.Task;
import com.example.home.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Создание задачи
    @PostMapping
    public ResponseEntity<String> createTask(@RequestBody Task task) {
        return new ResponseEntity<>(taskService.createTask(task), HttpStatus.CREATED);
    }

    // Получение всех задач
    @GetMapping("/all")
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }

    // Обновление задачи
    @PutMapping("/{id}")
    public ResponseEntity<String> updateTask(@PathVariable int id, @RequestBody Task task) {
        return new ResponseEntity<>(taskService.updateTask(id, task), HttpStatus.OK);
    }

    // Удаление задачи
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable int id) {
        return new ResponseEntity<>(taskService.deleteTask(id), HttpStatus.OK);
    }
}

