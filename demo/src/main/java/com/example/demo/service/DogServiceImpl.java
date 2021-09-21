package com.example.demo.service;

import com.example.demo.domain.Dogs;
import com.example.demo.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DogServiceImpl implements DogService{

    @Autowired
    DogRepository dogRepository;

    @Override
    public List<Dogs> getAllDogBreeds(){
        List<Dogs> dogList =new ArrayList<>();
        dogRepository.findAll().forEach(x->dogList.add(x));
        return dogList;
    }

    @Override
    public Iterable<Dogs> save(List<Dogs> dogs) {
        return dogRepository.saveAll(dogs);
    }

}
