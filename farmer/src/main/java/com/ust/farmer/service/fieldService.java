package com.ust.farmer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.farmer.model.Field;
import com.ust.farmer.repository.fieldRepository;

@Service
public class fieldService {

	

    @Autowired
    private fieldRepository repo;
    
    public Field createField(Field field) {
        return repo.save(field);

    }

}
