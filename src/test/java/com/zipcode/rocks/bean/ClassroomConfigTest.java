package com.zipcode.rocks.bean;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomConfigTest {

    @Autowired
    ClassroomConfig classroomConfig;

    @Test
    public void classroomConfigTest(){
        Classroom classroom = classroomConfig.currentCohort();

        Instructors classInstructors = classroom.getInstructors();

        List<Instructor> testList = new ArrayList<>();
        for(Instructor t : classInstructors){
            testList.add(t);
        }

        Assert.assertEquals("Tyrell", testList.get(0).getName());
    }

    @Test
    public void classroomConfigTest2(){
        Classroom classroom = classroomConfig.previousCohort();

        Instructors classInstructors = classroom.getInstructors();

        List<Instructor> testList = new ArrayList<>();
        for(Instructor t : classInstructors){
            testList.add(t);
        }

        Assert.assertEquals("Tariq", testList.get(1).getName());
    }
}
