package com.example.spring.services;

import com.example.spring.models.dtos.MySQLDTO;
import com.example.spring.repository.MySQLDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MySQLService {

    @Autowired
    private MySQLDTORepository mySQLDTORepository;

    public String getTextSQL() {
        long id = 27;
        Optional<MySQLDTO> sql = mySQLDTORepository.findById(id);
        return sql.get().text;
    }

}
