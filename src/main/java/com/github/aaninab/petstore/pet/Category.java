package com.github.aaninab.petstore.pet;

import com.github.aaninab.petstore.NamedEntity;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import java.util.Objects;

public class Category implements NamedEntity {

    @CheckForNull
    private final Long id;

    @Nonnull
    private final String name;

    public Category(@CheckForNull Long id, @Nonnull String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) &&
                name.equals(category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
