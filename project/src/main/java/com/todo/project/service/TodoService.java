package com.todo.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.project.model.Todo;
import com.todo.project.repository.TodoRepository;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repo;

    public List<Todo> getAll() { return repo.findAll(); }
    public Todo save(Todo todo) { return repo.save(todo); }
    public void delete(Long id) { repo.deleteById(id); }
    public Todo update(Todo todo) { return repo.save(todo); }
}
