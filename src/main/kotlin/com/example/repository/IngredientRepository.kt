package com.example.repository

import com.example.models.IngredientEntity
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface IngredientRepository: JpaRepository<IngredientEntity, Long> {
    fun findByName(name: String): IngredientEntity?

    fun findByIngredientId(id: Long): IngredientEntity? {
        return findById(id).orElse(null)
    }
}