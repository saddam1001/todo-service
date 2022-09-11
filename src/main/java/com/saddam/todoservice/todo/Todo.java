package com.saddam.todoservice.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

	@Id
//	@GeneratedValue
	private Long id;
	private String description;
	private String status;
	
	public Todo() {
		super();
	}
	public Todo(Long id, String description, String status) {
		super();
		this.id = id;
		this.description = description;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", description=" + description + ", status=" + status + "]";
	}
	
	
}
