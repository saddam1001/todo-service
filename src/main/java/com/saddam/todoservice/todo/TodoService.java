package com.saddam.todoservice.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepository;
	
	public List<Todo> retrieveTodo() {
		List<Todo> todos = todoRepository.findAll();
		return todos;
	}
}
