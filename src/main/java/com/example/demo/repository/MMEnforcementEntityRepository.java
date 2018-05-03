package com.example.demo.repository;

import com.example.demo.models.MMEnforceMentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



public interface MMEnforcementEntityRepository extends MongoRepository<MMEnforceMentEntity , Long> {

    MMEnforceMentEntity findByComplaintId(String complaintId);
}
