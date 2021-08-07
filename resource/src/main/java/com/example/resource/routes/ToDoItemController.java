package com.example.resource.routes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.resource.types.Response;

// Enable CORS
@CrossOrigin
@RestController
@RequestMapping("todo-items")
public class ToDoItemController {

	@GetMapping("")
    @ResponseBody
	public Response get() {
		Response res = new Response("hello");
        return res;
	}
    
	@PostMapping("")
    @ResponseBody
	public Response post() {
		Response res = new Response("post");
        return res;
	}

	@PutMapping("")
    @ResponseBody
	public Response put() {
		Response res = new Response("put");
        return res;
	}
    
	@DeleteMapping("")
    @ResponseBody
	public Response delete() {
		Response res = new Response("delet");
        return res;
	}

}
