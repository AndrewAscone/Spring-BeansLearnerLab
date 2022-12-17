package com.zipcode.rocks.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors(List<Instructor> UsaInstructors){
        return new Instructors(UsaInstructors);
    }

    @Bean
    public Instructors tcUkInstructors(List<Instructor> UkInstructors){
        return new Instructors(UkInstructors);
    }

    @Primary
    @Bean
    public Instructors instructors(List<Instructor> zcwInstructors){
        return new Instructors(zcwInstructors);
    }
}
