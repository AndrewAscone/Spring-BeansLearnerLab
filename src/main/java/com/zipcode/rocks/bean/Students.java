package com.zipcode.rocks.bean;

public final class Students extends People<Student> {

    private static final Students instance = new Students();

    public Students(){
        this.add(new Student(1L, "Carolina"));
        this.add(new Student(2L, "Calvin"));
        this.add(new Student(3L, "Freddy"));
        this.add(new Student(4L, "Emory"));
    }

    public static Students getInstance(){
        return instance;
    }

    public Student[] getArray(){
        return this.toArray(new Student[0]);
    }

}
