package com.Projects.jobPortal.repository;

import com.Projects.jobPortal.entity.post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface postRepository extends MongoRepository<post, String> {

}
