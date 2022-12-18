package com.zipcode.rocks.bean;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorConfigTest {

    @Autowired
    InstructorsConfig instructorsConfig;

    @Test
    @Qualifier("instructors")
    public void instructorConfigTest(){
        Instructors instructors = instructorsConfig.zcwInstructors();

        List<Instructor> testList = new ArrayList<>();
        for(Instructor t : instructors){
            testList.add(t);
        }

        Assert.assertEquals("Tyrell", testList.get(0).getName());
    }

}
