package com.github.aaninab.petstore.pet;

import org.springframework.stereotype.Repository;

@Repository
class PetRepository {
    Pet savePet(Pet petInput) {
        return petInput;
    }
}
