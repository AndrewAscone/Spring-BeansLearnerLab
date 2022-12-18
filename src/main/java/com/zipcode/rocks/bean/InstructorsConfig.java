package com.zipcode.rocks.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors(){
        return Instructors.getInstance();
    }

    @Bean
    public Instructors tcUkInstructors(){
        return Instructors.getInstance();
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors zcwInstructors(){
        return Instructors.getInstance();
    }
}
