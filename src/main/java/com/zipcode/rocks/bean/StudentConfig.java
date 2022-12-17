package com.zipcode.rocks.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents(List<Student> currentCohort){
        return new Students(currentCohort);
    }

    @Bean
    public Students previousCohort(List<Student> previousCohort){
        return new Students((previousCohort));
    }
}
