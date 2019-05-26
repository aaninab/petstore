package com.github.aaninab.petstore.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class PetService {

    private final PetRepository petRepository;

    @Autowired
    PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    Pet createPet(Pet petInput) {
        return petRepository.savePet(petInput);
    }

}
