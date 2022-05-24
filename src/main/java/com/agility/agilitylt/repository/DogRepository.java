package com.agility.agilitylt.repository;

import com.agility.agilitylt.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DogRepository extends JpaRepository<Dog, Long> {

//    Optional<Dog> findByOwnerNameAndName(String ownerName, String name);

//    List<Dog> findAllByOwnerName(String ownerName);

    List<Dog> findAllByBreed(String breed);

    List<Dog> findAllByDogSizeAndDivision(String dogSize, String division);



}
