package com.example.demo.repository;

import com.example.demo.domain.Dogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends JpaRepository<Dogs, String> {

}
