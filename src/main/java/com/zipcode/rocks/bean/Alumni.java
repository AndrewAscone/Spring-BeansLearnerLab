package com.zipcode.rocks.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alumni {

    @Autowired
    @Qualifier("students")
    Students students;

    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @PostConstruct
    public void executeBootCamp(){
        Instructor instructor1 = instructors.personList.get(0);
        Instructor instructor2 = instructors.personList.get(1);
        Instructor instructor3 = instructors.personList.get(2);
        Instructor instructor4 = instructors.personList.get(3);
        instructor1.lecture(students.getArray(), 600);
        instructor2.lecture(students.getArray(), 600);
        instructor3.lecture(students.getArray(), 600);
        instructor4.lecture(students.getArray(), 600);
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
