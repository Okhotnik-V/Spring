package com.example.spring.models.dtos;

import javax.persistence.*;


@Entity
@Table(name = "my_db")
public class MySQLDTO {
    public String text;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText() {
        this.text = text;
    }
}
