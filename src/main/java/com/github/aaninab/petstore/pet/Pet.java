package com.github.aaninab.petstore.pet;

import com.github.aaninab.petstore.NamedEntity;

import java.util.List;
import java.util.Objects;

public class Pet implements NamedEntity {


    private final Long id;


    private final String name;


    private final Category category;


    private final List<String> photoUrls;


    private final List<Tag> tags;


    private final PetStatus status;

    public Pet(Long id, String name, Category category, List<String> photoUrls, List<Tag> tags, PetStatus status) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    @Override

    public Long getId() {
        return id;
    }

    @Override

    public String getName() {
        return name;
    }


    public Category getCategory() {
        return category;
    }


    public List<String> getPhotoUrls() {
        return photoUrls;
    }


    public List<Tag> getTags() {
        return tags;
    }


    public PetStatus getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(id, pet.id) &&
                name.equals(pet.name) &&
                Objects.equals(category, pet.category) &&
                photoUrls.equals(pet.photoUrls) &&
                Objects.equals(tags, pet.tags) &&
                status == pet.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category, photoUrls, tags, status);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", photoUrls=" + photoUrls +
                ", tags=" + tags +
                ", status=" + status +
                '}';
    }
}
