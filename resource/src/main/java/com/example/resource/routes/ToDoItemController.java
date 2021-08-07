package com.example.resource.routes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("todo-items")
public class ToDoItemController {

	@GetMapping("")
    @ResponseBody
	public String get() {
		return "get";
	}
    
	@PostMapping("")
    @ResponseBody
	public String post() {
		return "post";
	}

	@PutMapping("")
    @ResponseBody
	public String put() {
		return "put";
	}
    
	@DeleteMapping("")
    @ResponseBody
	public String delete() {
		return "delet";
	}

}
