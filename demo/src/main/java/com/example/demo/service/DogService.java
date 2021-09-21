package com.example.demo.service;

import com.example.demo.domain.Dogs;

import java.util.List;


public interface DogService {

    public List<Dogs> getAllDogBreeds();

    public Iterable<Dogs> save(List<Dogs> dogs);

}
