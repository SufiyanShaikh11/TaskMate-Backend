package com.todo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.project.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {}
