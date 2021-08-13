package com.example.resource.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.resource.model.TodoItem;

import org.springframework.stereotype.Repository;

@Repository
interface ITodoItemRepo extends CrudRepository<TodoItem, Long>{
    
}
