package com.example.resource.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class IdOnly implements Serializable{
    public long id;
}
