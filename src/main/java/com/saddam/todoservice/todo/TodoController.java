package com.saddam.todoservice.todo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

	Logger logger = LoggerFactory.getLogger(TodoController.class);
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/todo")
	public List<Todo> retrieveTodo() {
		
		List<Todo> retrieveTodo = todoService.retrieveTodo();
		logger.info("retrieved todos -> {}", retrieveTodo); 
		
		return retrieveTodo;
	}
}
