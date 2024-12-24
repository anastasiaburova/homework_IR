package com.example.home.service;

import com.example.home.model_new.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

@Service
public class UserService {
    private final Map<Integer, User> userMap = new HashMap<>();

    // Создание пользователя
    public String createUser(User user) {
        if (userMap.containsKey(user.getId())) {
            return "User with this ID already exists.";
        }
        userMap.put(user.getId(), user);
        return "User added successfully.";
    }

    // Получение всех пользователей
    public List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    // Обновление пользователя
    public String updateUser(int id, User user) {
        if (!userMap.containsKey(id)) {
            return "User not found.";
        }
        userMap.put(id, user);
        return "User updated successfully.";
    }

    // Удаление пользователя
    public String deleteUser(int id) {
        if (userMap.remove(id) != null) {
            return "User deleted successfully";
        }
        return "User not found.";
    }
}
