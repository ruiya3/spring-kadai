package com.example.todoapp.domain.Form;

import java.io.Serializable;
import java.util.List;

import com.example.todoapp.domain.model.TodoItem;

import lombok.Data;

@Data
public class TodoItemForm implements Serializable{

	private List<TodoItem> TodoItems;

	  public void setTodoItems(List<TodoItem> todoItems) {
	        this.TodoItems = todoItems;
	    }
}
