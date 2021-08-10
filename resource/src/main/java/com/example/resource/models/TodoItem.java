package com.example.resource.models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

enum Status {
    completed,
    incomplete,
    removed;
}

@Entity(name="todo-item")
public class TodoItem {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String name;
    
    private String description;
    
    private Status status;
}
