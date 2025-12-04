package com.adocao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adocao.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer> {
 
 
}
