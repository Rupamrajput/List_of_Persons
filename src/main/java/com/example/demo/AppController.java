package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RequestMapping
@RestController
public class AppController {

    @Autowired
    private AppService appService;

    @GetMapping("/getAll")
    public List<Person> home(@Valid Person person){
        return appService.getAll();
    }

    @GetMapping("/save")
    public List<Person> add(@Valid Person person){
        return appService.save(person);
    }

    @GetMapping("/delete")
    public List<Person> remove(@Valid Person person){
        return appService.delete(person);
    }

}
