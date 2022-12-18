package com.zipcode.rocks.bean;

public class Instructors extends People<Instructor> {

    private static final Instructors instance = new Instructors();
    private Instructors() {
        super.add(new Instructor(1L, "Tyrell"));
        super.add(new Instructor(2L, "Tariq"));
        super.add(new Instructor(3L, "Kris"));
        super.add(new Instructor(4L, "Dolio"));
    }

    public static Instructors getInstance(){
        return instance;
    }

    public Instructor[] getArray(){
        return instance.toArray(new Student[0]);
    }
}
