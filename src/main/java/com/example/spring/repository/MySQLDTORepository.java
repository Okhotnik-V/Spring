package com.example.spring.repository;

import com.example.spring.models.dtos.MySQLDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MySQLDTORepository extends CrudRepository<MySQLDTO, Long> {
}
