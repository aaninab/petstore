package com.github.aaninab.petstore.pet;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
class PetRepository {
    private final JdbcTemplate jdbcTemplate;

    PetRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    Pet savePet(Pet petInput) {
        jdbcTemplate.update(
                "insert into pet values (?, ?, ?, ?)",
                petInput.getId(),
                petInput.getName(),
                petInput.getCategory().getId(),
                petInput.getStatus().name()
        );
        return petInput;
    }
}

/*

Test Data JSON:

{"id":0,"category":{"id":0,"name":"string"},"name":"doggie","photoUrls":["string"],"tags":[{"id":0,"name":"string"}],"status":"available"}

*/
