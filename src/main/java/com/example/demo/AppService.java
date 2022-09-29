package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    @Autowired
    private MainRepo mainRepo;
    public List<Person> save(Person person){
        mainRepo.save(person);
        return mainRepo.findAll();
    }
    public List<Person> delete(Person person){
        mainRepo.delete(person);
        return mainRepo.findAll();
    }

    public List<Person> getAll(){
        return mainRepo.findAll();
    }
}
