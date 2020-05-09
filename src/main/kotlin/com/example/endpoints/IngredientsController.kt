package com.example.endpoints

import com.example.models.IngredientEntity
import com.example.models.IngredientRequestBody
import com.example.repository.IngredientRepository
import io.micronaut.http.annotation.*

@Controller("/ingredients")
class IngredientsController(
        val ingredientRepository: IngredientRepository
) {

    @Get
    fun getAll() = ingredientRepository.findAll()

    @Get("/{id}")
    fun getById(@PathVariable id: Long) = ingredientRepository.findById(id)

    @Get("/nombre/{name}")
    fun getByName(@PathVariable name: String) = ingredientRepository.findByName(name)

    @Post
    fun insertIngredient(ingredient: IngredientRequestBody): String {
        val newIngredient = IngredientEntity(ingredient.name)
        ingredientRepository.save(newIngredient)
        return ingredient.name
    }

    @Put("/{id}")
    fun updateIngredient(@PathVariable id: Long, ingredient: IngredientRequestBody): IngredientEntity? {
        var existingIngredient = ingredientRepository.findByIngredientId(id)
        if (existingIngredient != null) {
            existingIngredient.name = ingredient.name
            return ingredientRepository.update(existingIngredient)
        }
        println("Ingredient not found for id: $id")
        return null
    }
}