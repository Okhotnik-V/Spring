package com.example.spring.models.dtos;

import javax.persistence.Id;

public class MongoDBDTO {

    @Id
    public String id;
    public String textMongoDB;

    public MongoDBDTO(String textMongoDB) {
        this.textMongoDB = textMongoDB;
    }

    @Override
    public String toString() {
        return String.format("MongoDBDTO[id=%s, textMongoDB='%s']", id, textMongoDB);
    }
}