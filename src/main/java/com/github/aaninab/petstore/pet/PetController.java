package com.github.aaninab.petstore.pet;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/pet")
class PetController {

    private final PetService petService;

    PetController(PetService petService) {
        this.petService = petService;
    }

    @PostMapping
    Pet createPet(@RequestBody Pet petInput) {
        return petService.createPet(petInput);
    }


}
