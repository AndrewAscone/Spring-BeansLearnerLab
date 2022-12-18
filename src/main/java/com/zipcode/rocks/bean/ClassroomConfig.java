package com.zipcode.rocks.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.List;

@Configuration
public class ClassroomConfig {

    @Autowired
    InstructorsConfig instructorsConfig;

    @Autowired
    StudentConfig studentConfig;

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(){
        return new Classroom();
    }

    @Bean
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(){
        return new Classroom();
    }
}
