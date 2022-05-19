//package com.agility.agilitylt.service;
//
//import com.agility.agilitylt.exception.DogNotFoundException;
//import com.agility.agilitylt.repository.DogRepository;
//import com.agility.agilitylt.repository.entity.Dog;
//import org.springframework.stereotype.Service;
//
//@Service
//public class DogService {
//
//    private final DogRepository dogRepository;
//
//    public DogService(DogRepository dogRepository) {
//        this.dogRepository = dogRepository;
//    }
//
//    public Dog register(Dog dog) { return dogRepository.save(dog);}
//
//    public Dog findById(Long id) {
//        return dogRepository
//                .findById(id)
//                .orElseThrow(DogNotFoundException::new);
//    }
//}
