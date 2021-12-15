package com.example.spring.repository;

import com.example.spring.models.dtos.MongoDBDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoDBRepository extends MongoRepository<MongoDBDTO, String> {
}
