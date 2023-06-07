package com.amazon.example.demoamazon.repository;

import com.amazon.example.demoamazon.domain.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    Todo findByTitle(String title);
}