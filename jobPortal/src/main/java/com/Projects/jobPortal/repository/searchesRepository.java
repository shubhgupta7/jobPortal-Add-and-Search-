package com.Projects.jobPortal.repository;

import com.Projects.jobPortal.entity.searches;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface searchesRepository extends MongoRepository<searches,String> {

}
