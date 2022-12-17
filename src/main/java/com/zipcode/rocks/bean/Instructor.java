package com.zipcode.rocks.bean;

import java.util.Collection;

public class Instructor extends Person implements Teacher {


    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        double length = ((Collection<?>) learners).size();
        double numberOfHoursPerLearner = numberOfHours / ((Collection<?>) learners).size();

        for (Learner i : learners) {
            i.learn(numberOfHoursPerLearner);
        }
    }
}
