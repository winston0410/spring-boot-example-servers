package com.example.resource.type.req;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

import com.example.resource.annotation.EnumNamePattern;

@Embeddable
public class TodoItem {
    public enum Status {
        completed,
        incomplete,
        removed;
    }
    @NotBlank(message = "Name required")
    public String name;
    
    @NotBlank(message = "Description required")
    public String description;
    
    @EnumNamePattern(regexp = "completed|incomplete|removed")
    public Status status;
}
