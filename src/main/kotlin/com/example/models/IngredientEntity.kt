package com.example.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "ingredients")
class IngredientEntity(
        var name: String
) {
    @Id
    @GeneratedValue
    var id: Long = 1

    constructor() : this("")
}