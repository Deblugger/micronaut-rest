package com.example

import com.example.models.IngredientEntity
import com.example.repository.IngredientRepository
import io.micronaut.context.ApplicationContext
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IngredientsControllerIntTest(
        private val ingredientRepository: IngredientRepository,
        private var server: EmbeddedServer,
        private var client: HttpClient
) {

    @BeforeAll
    fun setup() {
        server = ApplicationContext.run(EmbeddedServer::class.java)
        client = server
                .applicationContext
                .createBean(HttpClient::class.java, server.url)

        //ingredientRepository.save(IngredientEntity("calabaza"))
    }

    @Test
    fun updateIngredient() {
        val existingIngredient = client.toBlocking().retrieve("/ingredients/nombre/calabaza", IngredientEntity::class.java)
        assertEquals(existingIngredient.name, "calabaza")
    }
}