package com.example.demo.controller;

import com.example.demo.domain.Dogs;
import com.example.demo.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/breeds/list/all")
public class DogController {

    @Autowired
    DogService dogService;

    @GetMapping
    public List<Dogs> getAllDogBreeds(){
        return dogService.getAllDogBreeds();
    }

}
