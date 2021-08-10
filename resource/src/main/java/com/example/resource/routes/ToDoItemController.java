package com.example.resource.routes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.resource.types.Response;

// Enable CORS
@CrossOrigin
@RestController
@RequestMapping("todo-items")
public class TodoItemController {

	@GetMapping("")
    @ResponseBody
	public Response get() {
		Response res = new Response("bye bye");
        return res;
	}
    
	@PostMapping("")
    @ResponseBody
	public Response post() {
		Response res = new Response("post");
        return res;
	}

	@PutMapping("/{id}")
    @ResponseBody
	public Response put(@PathVariable String id) {
        System.out.println(id);
		Response res = new Response("put");
        return res;
	}
    
	@DeleteMapping("/{id}")
    @ResponseBody
	public Response delete(@PathVariable String id) {
		Response res = new Response("delet");
        return res;
	}

}
