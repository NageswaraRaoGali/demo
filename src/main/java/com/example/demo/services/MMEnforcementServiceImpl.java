package com.example.demo.services;

import com.example.demo.models.MMEnforceMentEntity;
import com.example.demo.repository.MMEnforcementEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



public class MMEnforcementServiceImpl implements MMEnforcementService {

    @Autowired
    MMEnforcementEntityRepository mmEnforcementEntityRepository;
    @Override
    public String  saveEnforcementData(MMEnforceMentEntity mmEnforceMentEntity) {
        mmEnforcementEntityRepository.save(mmEnforceMentEntity);
        return "Success";
    }

    @Override
    public MMEnforceMentEntity getEnforcementStatus(MMEnforceMentEntity mmEnforceMentEntity) {
        mmEnforceMentEntity = mmEnforcementEntityRepository.findByComplaintId(mmEnforceMentEntity.getComplaintId());
        return mmEnforceMentEntity;
    }
}
