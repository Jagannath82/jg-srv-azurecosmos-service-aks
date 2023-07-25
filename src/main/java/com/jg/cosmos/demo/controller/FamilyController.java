package com.jg.cosmos.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jg.cosmos.demo.dao.FamilyDao;
import com.jg.cosmos.demo.model.Families;
import com.jg.cosmos.demo.model.Family;

@Controller
@RequestMapping(path = "/family")
public class FamilyController {

    @Autowired
    private FamilyDao familyDao;

    @PostMapping
    public ResponseEntity<Family> createFamily(){
        Family family = Families.getWakefieldFamilyItem();
        return familyDao.create(family);
    }
}
