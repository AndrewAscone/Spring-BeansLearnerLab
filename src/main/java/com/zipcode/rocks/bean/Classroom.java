package com.zipcode.rocks.bean;

public class Classroom {

    Instructors instructors = Instructors.getInstance();

    Students students = Students.getInstance();

    public Classroom(Instructors instructors, Students students){
        this.instructors = instructors;
        this.students = students;
    }

    public Classroom(){

    }

    public void hostLecture(Long id, double numberOfHours){
        Teacher teacher = instructors.findById(id);
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }
}
