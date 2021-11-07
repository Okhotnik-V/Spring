package com.example.spring.models.dtos;

import javax.persistence.*;

@Entity
@Table(name = "my_db")
public class MySQLDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
