package com.example.spring.services;

import com.example.spring.models.dtos.MongoDBDTO;
import com.example.spring.repository.MongoDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MongoDBService {

    @Autowired
    private MongoDBRepository mongoDBRepository;

    public String getTextMongo() {
        Optional<MongoDBDTO> mongoOptional = mongoDBRepository.findById("618525f61f0b795a8cd78de8");
        return mongoOptional.get().textMongoDB;
    }
}
