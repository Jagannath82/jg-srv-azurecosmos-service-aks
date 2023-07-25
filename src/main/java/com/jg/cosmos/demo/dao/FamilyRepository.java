package com.jg.cosmos.demo.dao;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.jg.cosmos.demo.model.Family;

@Repository
public interface FamilyRepository extends CosmosRepository<Family, String> {

}
