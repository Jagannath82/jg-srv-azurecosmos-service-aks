package com.jg.cosmos.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jg.cosmos.demo.model.Family;

@Service
public class FamilyDao {
    
    @Autowired
    private FamilyRepository familyRepository;

    public ResponseEntity<Family> create(Family user) {

        System.out.println("add/update " + user);

        Family saved = familyRepository.save(user);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}
