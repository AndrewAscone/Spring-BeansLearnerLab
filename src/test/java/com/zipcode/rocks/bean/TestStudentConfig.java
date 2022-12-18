package com.zipcode.rocks.bean;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {StudentConfig.class})
public class TestStudentConfig {

    @Autowired
    StudentConfig studentConfig;

    @Test
    @Qualifier("students")
    public void currentStudentConfigBeanTest(){
        Students students = studentConfig.currentStudents();

        Student[] testArray = students.getArray();

        Assert.assertEquals("Carolina", testArray[0].getName());

//        students.add(new Student(1L, "Carolina"));
//        students.add(new Student(2L, "Calvin"));
//        students.add(new Student(3L, "Freddy"));
//        students.add(new Student(4L, "Emory"));
//
//        System.out.println(students.toString());
//
//        Students config = studentConfig.currentStudents(students);
//
//        String actual = config.toString();
//
//        String expected = "Carolina, Calvin, Freddy, Emory";
//
//        Assert.assertEquals(expected, actual);
    }

    @Test
    @Qualifier
    public void previousStudentsConfigBeanTest(){
        Students students = studentConfig.previousStudents();

        Student[] testArray = students.getArray();

        Assert.assertEquals("Freddy", testArray[2].getName());
    }


}
