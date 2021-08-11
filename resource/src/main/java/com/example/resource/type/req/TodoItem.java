package com.example.resource.type.req;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

enum Status {
    completed,
    incomplete,
    removed;
}

@Embeddable
public class TodoItem {
    @NotBlank(message = "Name required")
    public String name;
    
    @NotBlank(message = "Description required")
    public String description;
    
    // TODO: Validating enum
    public Status status;
}
