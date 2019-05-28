package com.github.aaninab.petstore.pet;

import org.springframework.stereotype.Service;

@Service
class PetService {

    private final PetRepository petRepository;

    PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    Pet createPet(Pet petInput) {
        return petRepository.savePet(petInput);
    }

}
