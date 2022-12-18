package com.zipcode.rocks.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

//    @Bean(name = "students")
//    public Students currentStudents(List<Student> currentCohort){
//        return new Students(currentCohort);
//    }

    @Bean(name = "students")
    public Students currentStudents(){
        return Students.getInstance();
    }

    @Bean
    public Students previousStudents(){
        return Students.getInstance();
    }
}
