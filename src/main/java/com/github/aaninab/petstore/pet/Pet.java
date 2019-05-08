package com.github.aaninab.petstore.pet;

import com.github.aaninab.petstore.NamedEntity;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class Pet implements NamedEntity {

    @CheckForNull
    private final Long id;

    @Nonnull
    private final String name;

    @CheckForNull
    private final Category category;

    @Nonnull
    private final List<String> photoUrls;

    @CheckForNull
    private final List<Tag> tags;

    @CheckForNull
    private final PetStatus status;

    public Pet(@Nullable Long id, @Nonnull String name, @Nullable Category category, @Nonnull List<String> photoUrls, @Nullable List<Tag> tags, @Nullable PetStatus status) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    @Override
    @CheckForNull
    public Long getId() {
        return id;
    }

    @Override
    @Nonnull
    public String getName() {
        return name;
    }

    @CheckForNull
    public Category getCategory() {
        return category;
    }

    @Nonnull
    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    @CheckForNull
    public List<Tag> getTags() {
        return tags;
    }

    @CheckForNull
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
