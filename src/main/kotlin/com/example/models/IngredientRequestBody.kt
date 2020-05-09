package com.example.models

import com.fasterxml.jackson.annotation.JsonValue

class IngredientRequestBody(@JsonValue val name: String)
/*
{
    name: "bernues"
}
 */