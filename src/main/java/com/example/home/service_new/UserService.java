package com.example.home.service_new;

import com.example.home.model_new.User;
import com.example.home.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Создание пользователя
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Получение всех пользователей
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Обновление пользователя
    public User updateUser(int id, User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    // Удаление пользователя
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    // Поиск пользователя по ID
    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }
}

