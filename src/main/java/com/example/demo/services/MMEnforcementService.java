package com.example.demo.services;

import com.example.demo.models.MMEnforceMentEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface MMEnforcementService {

    String saveEnforcementData(MMEnforceMentEntity mmEnforceMentEntity);

    MMEnforceMentEntity getEnforcementStatus(MMEnforceMentEntity mmEnforceMentEntity);
}
