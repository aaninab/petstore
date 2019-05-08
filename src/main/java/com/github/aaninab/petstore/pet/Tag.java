package com.github.aaninab.petstore.pet;

import com.github.aaninab.petstore.NamedEntity;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import java.util.Objects;

public class Tag implements NamedEntity {

    @CheckForNull
    private final Long id;

    @Nonnull
    private final String name;

    public Tag(@CheckForNull Long id, @Nonnull String name) {
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
        Tag tag = (Tag) o;
        return Objects.equals(id, tag.id) &&
                name.equals(tag.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
