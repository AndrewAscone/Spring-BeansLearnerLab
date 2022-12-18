package com.zipcode.rocks.bean;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumniTest {

    @Autowired
    Alumni alumni;

    @Test
    public void alumniTest(){

        alumni.executeBootCamp();

        int numberOfInstructors = alumni.getInstructors().size();
        int numberOfStudents = alumni.getStudents().size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

        Student test = alumni.getStudents().findById(1);
        Assert.assertEquals(numberOfHoursToTeachEachStudent, test.getTotalStudyTime(), 0.001);
        Assert.assertEquals(1200, numberOfHoursPerInstructor, 0.001);
    }
}
