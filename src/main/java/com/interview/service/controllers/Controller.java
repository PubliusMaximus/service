package com.interview.service.controllers;

import com.google.gson.Gson;
import com.interview.service.models.Person;
import com.interview.service.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    CustomerRepository repository;

    @RequestMapping("/selectbyid")
    public String selectbyid(@RequestParam("id") long id) {
        String jsonString = "";
        Gson gson = new Gson();
        jsonString = gson.toJson(repository.findById(id));
        return jsonString;
    }

    @RequestMapping("/selectbyfew")
    public String selectbyid(@RequestParam("name") String name,@RequestParam("category") int category, @RequestParam("description") String description) {
        String jsonString = "";
        Gson gson = new Gson();
        jsonString = gson.toJson(repository.findByNameAndCategoryAndDescription(name,category,description));
        return jsonString;
    }

    @RequestMapping("/selectall")
    public String selectall(){
        String jsonString = "";
        Gson gson = new Gson();
        jsonString = gson.toJson(repository.findAll());
        return jsonString;
    }

    @RequestMapping("/deleteall")
    public void deleteall(){
        repository.deleteAll();
    }

    @RequestMapping("/insert")
    public void insert(@RequestParam("name") String name, @RequestParam("jndi_name") String jndiName, @RequestParam("description") String description,
                       @RequestParam("category") int category, @RequestParam("url") String url, @RequestParam("nickname") String nickname,
                       @RequestParam("password") String password, @RequestParam("timeout") float timeout, @RequestParam("max_connects") int maxConnects,
                       @RequestParam("min_connects") int minConnects) {
        repository.save(new Person(name, jndiName, description, category, url, nickname, password, timeout, maxConnects, minConnects));
    }
}
