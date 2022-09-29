package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class PersonRepo implements MainRepo{

    private final List<Person> studentList = Collections.synchronizedList(new ArrayList<>());

    @Override
    public void delete(Person person) {
        studentList.remove(person);
    }

    @Override
    public List<Person> findAll() {
        return Collections.unmodifiableList(studentList);
    }

    @Override
    public void save(Person person) {
        if(!studentList.contains(person)){
            studentList.add(person);
        }
    }
}
