package com.github.aaninab.petstore;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

public interface NamedEntity {

    @CheckForNull
    public Long getId();

    @Nonnull
    public String getName();
}
