package com.example.spring.models.dtos;


import org.springframework.data.annotation.Id;


public class MongoDBDTO {

    @Id
    public String id;
    public String textMongoDB;

    public MongoDBDTO() {
    }

    public MongoDBDTO(String textMongoDB) {
        this.textMongoDB = textMongoDB;
    }

    @Override
    public String toString() {
        return String.format("MongoDBDTO[id=%s, textMongoDB='%s']", id, textMongoDB);
    }
}
