package com.example.endpoints;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0007\u001a$\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u000b0\bH\u0007J \u0010\f\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/example/endpoints/IngredientsController;", "", "ingredientRepository", "Lcom/example/repository/IngredientRepository;", "(Lcom/example/repository/IngredientRepository;)V", "getIngredientRepository", "()Lcom/example/repository/IngredientRepository;", "getAll", "", "Lcom/example/models/IngredientEntity;", "kotlin.jvm.PlatformType", "", "getById", "Ljava/util/Optional;", "id", "", "getByName", "name", "", "insertIngredient", "ingredient", "Lcom/example/models/IngredientRequestBody;", "updateIngredient", "demo"})
@io.micronaut.http.annotation.Controller(value = "/ingredients")
public final class IngredientsController {
    @org.jetbrains.annotations.NotNull()
    private final com.example.repository.IngredientRepository ingredientRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get()
    public final java.util.List<com.example.models.IngredientEntity> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{id}")
    public final java.util.Optional<com.example.models.IngredientEntity> getById(@io.micronaut.http.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get(value = "/nombre/{name}")
    public final com.example.models.IngredientEntity getByName(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post()
    public final java.lang.String insertIngredient(@org.jetbrains.annotations.NotNull()
    com.example.models.IngredientRequestBody ingredient) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Put(value = "/{id}")
    public final com.example.models.IngredientEntity updateIngredient(@io.micronaut.http.annotation.PathVariable()
    long id, @org.jetbrains.annotations.NotNull()
    com.example.models.IngredientRequestBody ingredient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.repository.IngredientRepository getIngredientRepository() {
        return null;
    }
    
    public IngredientsController(@org.jetbrains.annotations.NotNull()
    com.example.repository.IngredientRepository ingredientRepository) {
        super();
    }
}