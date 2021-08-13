package com.example.resource.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class IdOnly implements Serializable{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
}
