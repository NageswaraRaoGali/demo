package com.example.demo.config;

import com.example.demo.repository.MMEnforcementEntityRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = MMEnforcementEntityRepository.class)
@Configuration
public class ApplicationConfiguration {


}
