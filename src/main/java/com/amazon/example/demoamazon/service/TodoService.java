package com.amazon.example.demoamazon.service;

import com.amazon.example.demoamazon.domain.Todo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface TodoService {
    Todo saveTodo(String title, String description, MultipartFile file);

    byte[] downloadTodoImage(Long id);

    List<Todo> getAllTodos();
}
