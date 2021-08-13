package com.example.resource.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;

@Entity
@Table(name = "todo_item")
public class TodoItem {

    // @Embedded
    @EmbeddedId
    public IdOnly idOnly;

    @Embedded
    public com.example.resource.type.req.TodoItem todoItem;
}
