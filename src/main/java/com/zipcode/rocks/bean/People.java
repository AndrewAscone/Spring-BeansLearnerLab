package com.zipcode.rocks.bean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<T extends Person> implements Iterable<T> {

    List<T> personList;

    public People(List<T> personList) {
        this.personList = personList;
    }

    public People(){
        this(new ArrayList<>());
    }

    public void add(T t){
        personList.add(t);
    }

    public void remove(T t){
        personList.remove(t);
    }

    public Integer size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<T> list){
        for (T person: list) {
            add(person);
        }
    }

    public T findById(long id){
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id) {
                return personList.get(i);
            }
        }

        return null;
    }

    public List<T> findAll(){
        return personList;
    }

    public T[] toArray(Student[] students){
        T[] newArray = (T[]) Array.newInstance(personList.get(0).getClass(), personList.size());
        for (int i = 0; i < personList.size(); i++) {
            newArray[i] = personList.get(i);
        }
        return newArray;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < personList.size(); i++) {
            str += personList.get(i).getName();
            if(i != personList.size() - 1){
                str += ", ";
            }
        }
        return str;
    }

    @Override
    public Iterator<T> iterator(){
        return personList.stream().iterator();
    }
}
