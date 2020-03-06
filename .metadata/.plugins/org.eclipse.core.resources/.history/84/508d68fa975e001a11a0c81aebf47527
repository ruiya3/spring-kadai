package com.example.todoapp.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todoapp.domain.model.TodoItem;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem,Long> {

	List<TodoItem> findByOrderByTitleAsc();


}
