package com.example.resource.type.req;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Embeddable;
import javax.persistence.Column;
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
    @Column(nullable = false)
    public String name;
    
    @NotBlank(message = "Description required")
    @Column(nullable = false)
    public String description;
    
    @EnumNamePattern(regexp = "completed|incomplete|removed")
    @Column(columnDefinition = "varchar(20)", nullable = false)
    public Status status;
}
