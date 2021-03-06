package com.example.todoapp.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Table
@Data
public class TodoItem{
	@Id
	@GeneratedValue
	  private long id;
	 @NotEmpty
	  private String title;
	  private boolean done;
}
