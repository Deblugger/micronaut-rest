package com.example.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Lcom/example/models/IngredientEntity;", "", "()V", "name", "", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "setId", "(J)V", "getName", "()Ljava/lang/String;", "setName", "demo"})
@javax.persistence.Table(name = "ingredients")
@javax.persistence.Entity()
public final class IngredientEntity {
    @javax.persistence.GeneratedValue()
    @javax.persistence.Id()
    private long id = 1L;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public IngredientEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super();
    }
    
    public IngredientEntity() {
        super();
    }
}